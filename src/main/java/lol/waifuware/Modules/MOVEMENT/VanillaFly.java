package lol.waifuware.Modules.MOVEMENT;

import lol.waifuware.Events.OnTickEvent;
import lol.waifuware.Modules.CATEGORY;
import lol.waifuware.Modules.AbstractModule;
import lol.waifuware.Modules.Interfaces.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.MinecraftClient;

@Module(name = "VanillaFly", key = 0, cat = CATEGORY.MOVEMENT)
public class VanillaFly extends AbstractModule
{
    int timer = 0;
    public VanillaFly()
    {
        super();
        desc[0] = "Fly on bad servers";
        Create();
    }

    @EventHandler
    public void onTick(OnTickEvent e){
        assert MinecraftClient.getInstance().player != null;
        if(isEnabled)
        {
            timer++;
            MinecraftClient.getInstance().player.getAbilities().flying = true;
            if(timer > 20) {
              timer = 0;
              MinecraftClient.getInstance().player.setVelocity(0, -0.04, 0)
            }
           }
        }
    }



    @Override
    public void onDisable() {
        assert MinecraftClient.getInstance().player != null;
        MinecraftClient.getInstance().player.getAbilities().flying = true;
        timer = 0;
    }
}
