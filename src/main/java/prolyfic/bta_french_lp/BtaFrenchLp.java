package prolyfic.bta_french_lp;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class BtaFrenchLp implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "bta_french_lp";
	private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BTA! French Language pack initialized.");
	}

	@Override
	public void onRecipesReady() {
		// TODO document why this method is empty
	}

	@Override
	public void initNamespaces() {
		// TODO document why this method is empty
	}

	@Override
	public void beforeGameStart() {
		// TODO document why this method is empty
	}

	@Override
	public void afterGameStart() {
		// TODO document why this method is empty
	}
}
