package prolyfic.bta_french_lp.mixin;

import net.minecraft.core.lang.Language;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Arrays;
import java.util.List;

@Mixin(value = Language.class, remap = false)
public abstract class LanguageMixin {
	private LanguageMixin() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Sets the language ID in its compressed file
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/zip/ZipFile;)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
	private static String setZipFileId(String id) {
		return "fr_FR";
	}

	/**
	 * Sets the language name in its compressed file
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/zip/ZipFile;)V", at = @At("HEAD"), ordinal = 1, argsOnly = true)
	private static String setZipFileName(String id) {
		return "Français";
	}

	/**
	 * Sets the language region in its compressed file
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/zip/ZipFile;)V", at = @At("HEAD"), ordinal = 2, argsOnly = true)
	private static String setZipFileRegion(String id) {
		return "France";
	}

//	/**
//	 * Sets the credits in its compressed file
//	 *
//	 * @param id Language ID
//	 * @return French (France) language
//	 */
//	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/zip/ZipFile;)V", at = @At("HEAD"), ordinal = 3, argsOnly = true)
//	private static List<String> setZipFileCredits(String id) {
//		return Arrays.asList("Mojang", "RatonGuerrier", "Vazanoir", "Prolyfic");
//	}

	/**
	 * Sets the language ID
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)V", at = @At("HEAD"), ordinal = 0, argsOnly = true)
	private static String setDirectoryIdr(String id) {
		return "fr_FR";
	}

	/**
	 * Sets the language name
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)V", at = @At("HEAD"), ordinal = 1, argsOnly = true)
	private static String setDirectoryName(String id) {
		return "Français";
	}

	/**
	 * Sets the language region
	 *
	 * @param id Language ID
	 * @return French (France) language
	 */
	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)V", at = @At("HEAD"), ordinal = 2, argsOnly = true)
	private static String setDirectoryRegion(String id) {
		return "France";
	}

//	/**
//	 * Sets the credits
//	 *
//	 * @param id Language ID
//	 * @return French (France) language
//	 */
//	@ModifyVariable(method = "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/io/File;)V", at = @At("HEAD"), ordinal = 3, argsOnly = true)
//	private static List<String> setDirectoryCredits(String id) {
//		return Arrays.asList("Mojang", "RatonGuerrier", "Vazanoir", "Prolyfic");
//	}
}
