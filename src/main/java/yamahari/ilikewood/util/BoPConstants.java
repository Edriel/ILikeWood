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

    public static final ImmutableSet<Block> BARRELS =
            ImmutableSet.of(
                    ModBlocks.cherry_barrel,
                    ModBlocks.dead_barrel,
                    ModBlocks.ethereal_barrel,
                    ModBlocks.fir_barrel,
                    ModBlocks.hellbark_barrel,
                    ModBlocks.jacaranda_barrel,
                    ModBlocks.magic_barrel,
                    ModBlocks.mahogany_barrel,
                    ModBlocks.palm_barrel,
                    ModBlocks.redwood_barrel,
                    ModBlocks.umbran_barrel,
                    ModBlocks.willow_barrel
            );

    public static final ImmutableSet<Block> BOOKSHELFS =
            ImmutableSet.of(
                    ModBlocks.cherry_bookshelf,
                    ModBlocks.dead_bookshelf,
                    ModBlocks.ethereal_bookshelf,
                    ModBlocks.fir_bookshelf,
                    ModBlocks.hellbark_bookshelf,
                    ModBlocks.jacaranda_bookshelf,
                    ModBlocks.magic_bookshelf,
                    ModBlocks.mahogany_bookshelf,
                    ModBlocks.palm_bookshelf,
                    ModBlocks.redwood_bookshelf,
                    ModBlocks.umbran_bookshelf,
                    ModBlocks.willow_bookshelf
            );

    public static final ImmutableSet<Block> COMPOSTERS =
            ImmutableSet.of(
                    ModBlocks.cherry_composter,
                    ModBlocks.dead_composter,
                    ModBlocks.ethereal_composter,
                    ModBlocks.fir_composter,
                    ModBlocks.hellbark_composter,
                    ModBlocks.jacaranda_composter,
                    ModBlocks.magic_composter,
                    ModBlocks.mahogany_composter,
                    ModBlocks.palm_composter,
                    ModBlocks.redwood_composter,
                    ModBlocks.umbran_composter,
                    ModBlocks.willow_composter
            );

    public static final ImmutableSet<Block> LECTERNS =
            ImmutableSet.of(
                    ModBlocks.cherry_lectern,
                    ModBlocks.dead_lectern,
                    ModBlocks.ethereal_lectern,
                    ModBlocks.fir_lectern,
                    ModBlocks.hellbark_lectern,
                    ModBlocks.jacaranda_lectern,
                    ModBlocks.magic_lectern,
                    ModBlocks.mahogany_lectern,
                    ModBlocks.palm_lectern,
                    ModBlocks.redwood_lectern,
                    ModBlocks.umbran_lectern,
                    ModBlocks.willow_lectern
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
