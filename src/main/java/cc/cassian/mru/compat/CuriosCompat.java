package cc.cassian.mru.compat;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;
//? if >1.20.1 || forge {
import top.theillusivec4.curios.api.CuriosApi;
//?}

public class CuriosCompat {
    public static void checkForImportantAccessories(Player player, Consumer<ItemStack> isImportantItemOrContainer) {
        //? if >1.20.1 || forge {
        var capability = CuriosApi.getCuriosInventory(player);
        if (capability.isPresent()) {
            var allEquipped = capability
                    //? if <1.21
                    //.resolve()
                    .get().getEquippedCurios();
            //~ if >26.2 'getSlots'->'size'
            for (int i = 0; i < allEquipped.size(); i++) {
                //? if >26.2 {
                isImportantItemOrContainer.accept(allEquipped.getResource(i).toStack());
                //?} else {
                /*isImportantItemOrContainer.accept(allEquipped.getStackInSlot(i));
                *///?}
            }
        }
        //?}
    }
}
