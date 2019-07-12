package yamahari.ilikewood.util;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import yamahari.ilikewood.objectholders.ModBlocks;

import java.util.HashMap;
import java.util.Map;

public class BoPConstants {
    public static final ImmutableMap<Block, Block> TORCHES;

    public static final ImmutableSet<Block> LADDERS =
            ImmutableSet.of(
                ModBlocks.cherry_ladder,
                ModBlocks.dead_ladder,
                ModBlocks.ethereal_ladder,
                ModBlocks.fir_ladder,
                ModBlocks.hellbark_ladder,
                ModBlocks.jacaranda_ladder,
                ModBlocks.magic_ladder,
                ModBlocks.mahogany_ladder,
                ModBlocks.palm_ladder,
                ModBlocks.redwood_ladder,
                ModBlocks.umbran_ladder,
                ModBlocks.willow_ladder
            );

    static {
        Map<Block, Block> torches = new HashMap();
        torches.put(ModBlocks.cherry_torch, ModBlocks.cherry_wall_torch);
        torches.put(ModBlocks.dead_torch, ModBlocks.dead_wall_torch);
        torches.put(ModBlocks.ethereal_torch, ModBlocks.ethereal_wall_torch);
        torches.put(ModBlocks.fir_torch, ModBlocks.fir_wall_torch);
        torches.put(ModBlocks.hellbark_torch, ModBlocks.hellbark_wall_torch);
        torches.put(ModBlocks.jacaranda_torch, ModBlocks.jacaranda_wall_torch);
        torches.put(ModBlocks.magic_torch, ModBlocks.magic_wall_torch);
        torches.put(ModBlocks.mahogany_torch, ModBlocks.mahogany_wall_torch);
        torches.put(ModBlocks.palm_torch, ModBlocks.palm_wall_torch);
        torches.put(ModBlocks.redwood_torch, ModBlocks.redwood_wall_torch);
        torches.put(ModBlocks.umbran_torch, ModBlocks.umbran_wall_torch);
        torches.put(ModBlocks.willow_torch, ModBlocks.willow_wall_torch);
        TORCHES = ImmutableMap.copyOf(torches);
    }
}
