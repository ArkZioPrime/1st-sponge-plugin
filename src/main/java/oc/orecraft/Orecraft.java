package oc.orecraft;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "orecraft",
        name = "Orecraft",
        version = "1.1-SNAPSHOT",
        authors = {
                "zuilinqwq"
        }
)
public class Orecraft {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("很高兴来到你的服务器");
    }
}
