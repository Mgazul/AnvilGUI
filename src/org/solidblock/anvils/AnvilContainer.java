package org.solidblock.anvils;

import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.ContainerAnvil;
import net.minecraft.server.v1_12_R1.EntityHuman;

public class AnvilContainer extends ContainerAnvil {
    public AnvilContainer(EntityHuman entity) {

        super(entity.inventory, entity.world, new BlockPosition(0, 0, 0), entity);
    }

    @Override
    public boolean canUse(EntityHuman entityhuman) {
        return true;
    }
}