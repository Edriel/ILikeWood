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

    public static final ImmutableSet<Block> SCAFFOLDINGS =
            ImmutableSet.of(
                    ModBlocks.cherry_scaffolding,
                    ModBlocks.dead_scaffolding,
                    ModBlocks.ethereal_scaffolding,
                    ModBlocks.fir_scaffolding,
                    ModBlocks.hellbark_scaffolding,
                    ModBlocks.jacaranda_scaffolding,
                    ModBlocks.magic_scaffolding,
                    ModBlocks.mahogany_scaffolding,
                    ModBlocks.palm_scaffolding,
                    ModBlocks.redwood_scaffolding,
                    ModBlocks.umbran_scaffolding,
                    ModBlocks.willow_scaffolding
            );

    public static final ImmutableSet<Block> BEDS =
            ImmutableSet.of(
                    ModBlocks.black_cherry_bed,
                    ModBlocks.black_dead_bed,
                    ModBlocks.black_ethereal_bed,
                    ModBlocks.black_fir_bed,
                    ModBlocks.black_hellbark_bed,
                    ModBlocks.black_jacaranda_bed,
                    ModBlocks.black_magic_bed,
                    ModBlocks.black_mahogany_bed,
                    ModBlocks.black_palm_bed,
                    ModBlocks.black_redwood_bed,
                    ModBlocks.black_umbran_bed,
                    ModBlocks.black_willow_bed,
                    ModBlocks.blue_cherry_bed,
                    ModBlocks.blue_dead_bed,
                    ModBlocks.blue_ethereal_bed,
                    ModBlocks.blue_fir_bed,
                    ModBlocks.blue_hellbark_bed,
                    ModBlocks.blue_jacaranda_bed,
                    ModBlocks.blue_magic_bed,
                    ModBlocks.blue_mahogany_bed,
                    ModBlocks.blue_palm_bed,
                    ModBlocks.blue_redwood_bed,
                    ModBlocks.blue_umbran_bed,
                    ModBlocks.blue_willow_bed,
                    ModBlocks.brown_cherry_bed,
                    ModBlocks.brown_dead_bed,
                    ModBlocks.brown_ethereal_bed,
                    ModBlocks.brown_fir_bed,
                    ModBlocks.brown_hellbark_bed,
                    ModBlocks.brown_jacaranda_bed,
                    ModBlocks.brown_magic_bed,
                    ModBlocks.brown_mahogany_bed,
                    ModBlocks.brown_palm_bed,
                    ModBlocks.brown_redwood_bed,
                    ModBlocks.brown_umbran_bed,
                    ModBlocks.brown_willow_bed,
                    ModBlocks.cyan_cherry_bed,
                    ModBlocks.cyan_dead_bed,
                    ModBlocks.cyan_ethereal_bed,
                    ModBlocks.cyan_fir_bed,
                    ModBlocks.cyan_hellbark_bed,
                    ModBlocks.cyan_jacaranda_bed,
                    ModBlocks.cyan_magic_bed,
                    ModBlocks.cyan_mahogany_bed,
                    ModBlocks.cyan_palm_bed,
                    ModBlocks.cyan_redwood_bed,
                    ModBlocks.cyan_umbran_bed,
                    ModBlocks.cyan_willow_bed,
                    ModBlocks.gray_cherry_bed,
                    ModBlocks.gray_dead_bed,
                    ModBlocks.gray_ethereal_bed,
                    ModBlocks.gray_fir_bed,
                    ModBlocks.gray_hellbark_bed,
                    ModBlocks.gray_jacaranda_bed,
                    ModBlocks.gray_magic_bed,
                    ModBlocks.gray_mahogany_bed,
                    ModBlocks.gray_palm_bed,
                    ModBlocks.gray_redwood_bed,
                    ModBlocks.gray_umbran_bed,
                    ModBlocks.gray_willow_bed,
                    ModBlocks.green_cherry_bed,
                    ModBlocks.green_dead_bed,
                    ModBlocks.green_ethereal_bed,
                    ModBlocks.green_fir_bed,
                    ModBlocks.green_hellbark_bed,
                    ModBlocks.green_jacaranda_bed,
                    ModBlocks.green_magic_bed,
                    ModBlocks.green_mahogany_bed,
                    ModBlocks.green_palm_bed,
                    ModBlocks.green_redwood_bed,
                    ModBlocks.green_umbran_bed,
                    ModBlocks.green_willow_bed,
                    ModBlocks.light_blue_cherry_bed,
                    ModBlocks.light_blue_dead_bed,
                    ModBlocks.light_blue_ethereal_bed,
                    ModBlocks.light_blue_fir_bed,
                    ModBlocks.light_blue_hellbark_bed,
                    ModBlocks.light_blue_jacaranda_bed,
                    ModBlocks.light_blue_magic_bed,
                    ModBlocks.light_blue_mahogany_bed,
                    ModBlocks.light_blue_palm_bed,
                    ModBlocks.light_blue_redwood_bed,
                    ModBlocks.light_blue_umbran_bed,
                    ModBlocks.light_blue_willow_bed,
                    ModBlocks.light_gray_cherry_bed,
                    ModBlocks.light_gray_dead_bed,
                    ModBlocks.light_gray_ethereal_bed,
                    ModBlocks.light_gray_fir_bed,
                    ModBlocks.light_gray_hellbark_bed,
                    ModBlocks.light_gray_jacaranda_bed,
                    ModBlocks.light_gray_magic_bed,
                    ModBlocks.light_gray_mahogany_bed,
                    ModBlocks.light_gray_palm_bed,
                    ModBlocks.light_gray_redwood_bed,
                    ModBlocks.light_gray_umbran_bed,
                    ModBlocks.light_gray_willow_bed,
                    ModBlocks.lime_cherry_bed,
                    ModBlocks.lime_dead_bed,
                    ModBlocks.lime_ethereal_bed,
                    ModBlocks.lime_fir_bed,
                    ModBlocks.lime_hellbark_bed,
                    ModBlocks.lime_jacaranda_bed,
                    ModBlocks.lime_magic_bed,
                    ModBlocks.lime_mahogany_bed,
                    ModBlocks.lime_palm_bed,
                    ModBlocks.lime_redwood_bed,
                    ModBlocks.lime_umbran_bed,
                    ModBlocks.lime_willow_bed,
                    ModBlocks.magenta_cherry_bed,
                    ModBlocks.magenta_dead_bed,
                    ModBlocks.magenta_ethereal_bed,
                    ModBlocks.magenta_fir_bed,
                    ModBlocks.magenta_hellbark_bed,
                    ModBlocks.magenta_jacaranda_bed,
                    ModBlocks.magenta_magic_bed,
                    ModBlocks.magenta_mahogany_bed,
                    ModBlocks.magenta_palm_bed,
                    ModBlocks.magenta_redwood_bed,
                    ModBlocks.magenta_umbran_bed,
                    ModBlocks.magenta_willow_bed,
                    ModBlocks.orange_cherry_bed,
                    ModBlocks.orange_dead_bed,
                    ModBlocks.orange_ethereal_bed,
                    ModBlocks.orange_fir_bed,
                    ModBlocks.orange_hellbark_bed,
                    ModBlocks.orange_jacaranda_bed,
                    ModBlocks.orange_magic_bed,
                    ModBlocks.orange_mahogany_bed,
                    ModBlocks.orange_palm_bed,
                    ModBlocks.orange_redwood_bed,
                    ModBlocks.orange_umbran_bed,
                    ModBlocks.orange_willow_bed,
                    ModBlocks.pink_cherry_bed,
                    ModBlocks.pink_dead_bed,
                    ModBlocks.pink_ethereal_bed,
                    ModBlocks.pink_fir_bed,
                    ModBlocks.pink_hellbark_bed,
                    ModBlocks.pink_jacaranda_bed,
                    ModBlocks.pink_magic_bed,
                    ModBlocks.pink_mahogany_bed,
                    ModBlocks.pink_palm_bed,
                    ModBlocks.pink_redwood_bed,
                    ModBlocks.pink_umbran_bed,
                    ModBlocks.pink_willow_bed,
                    ModBlocks.purple_cherry_bed,
                    ModBlocks.purple_dead_bed,
                    ModBlocks.purple_ethereal_bed,
                    ModBlocks.purple_fir_bed,
                    ModBlocks.purple_hellbark_bed,
                    ModBlocks.purple_jacaranda_bed,
                    ModBlocks.purple_magic_bed,
                    ModBlocks.purple_mahogany_bed,
                    ModBlocks.purple_palm_bed,
                    ModBlocks.purple_redwood_bed,
                    ModBlocks.purple_umbran_bed,
                    ModBlocks.purple_willow_bed,
                    ModBlocks.red_cherry_bed,
                    ModBlocks.red_dead_bed,
                    ModBlocks.red_ethereal_bed,
                    ModBlocks.red_fir_bed,
                    ModBlocks.red_hellbark_bed,
                    ModBlocks.red_jacaranda_bed,
                    ModBlocks.red_magic_bed,
                    ModBlocks.red_mahogany_bed,
                    ModBlocks.red_palm_bed,
                    ModBlocks.red_redwood_bed,
                    ModBlocks.red_umbran_bed,
                    ModBlocks.red_willow_bed,
                    ModBlocks.white_cherry_bed,
                    ModBlocks.white_dead_bed,
                    ModBlocks.white_ethereal_bed,
                    ModBlocks.white_fir_bed,
                    ModBlocks.white_hellbark_bed,
                    ModBlocks.white_jacaranda_bed,
                    ModBlocks.white_magic_bed,
                    ModBlocks.white_mahogany_bed,
                    ModBlocks.white_palm_bed,
                    ModBlocks.white_redwood_bed,
                    ModBlocks.white_umbran_bed,
                    ModBlocks.white_willow_bed,
                    ModBlocks.yellow_cherry_bed,
                    ModBlocks.yellow_dead_bed,
                    ModBlocks.yellow_ethereal_bed,
                    ModBlocks.yellow_fir_bed,
                    ModBlocks.yellow_hellbark_bed,
                    ModBlocks.yellow_jacaranda_bed,
                    ModBlocks.yellow_magic_bed,
                    ModBlocks.yellow_mahogany_bed,
                    ModBlocks.yellow_palm_bed,
                    ModBlocks.yellow_redwood_bed,
                    ModBlocks.yellow_umbran_bed,
                    ModBlocks.yellow_willow_bed
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
