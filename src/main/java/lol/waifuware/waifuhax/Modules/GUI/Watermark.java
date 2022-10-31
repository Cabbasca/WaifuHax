package lol.waifuware.waifuhax.Modules.GUI;

import lol.waifuware.waifuhax.Modules.Module;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class Watermark extends Module
{
    public Watermark(String name, int Key)
    {
        super(name, Key);
    }

    @Override
    public void Update() {

    }

    @Override
    public void Render(MatrixStack matrice)
    {
        MinecraftClient.getInstance().textRenderer.drawWithShadow(matrice, "WaifuHax V1.0", 5, 5, fromRGBA(255, 255, 255, 255 ));
    }

    private int fromRGBA(int r, int g, int b, int a) {
        return (r << 16) + (g << 8) + (b) + (a << 24);
    }

    @Override
    public void onActivate() {

    }

    @Override
    public void onDisable() {

    }
}
