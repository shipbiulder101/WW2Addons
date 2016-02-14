package com.joshuabasley.WW2Additions;

import com.joshuabasley.WW2Additions.block.blockAirRaidSiren;
import com.joshuabasley.WW2Additions.block.blockSandbag;
import com.joshuabasley.WW2Additions.item.itemKarambit;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by josh_000 on 06/02/2016.
 */
@Mod(modid = "wwa", name = "WW2 Additions", version = "1.0")
public class WW2Additions {

    public static Item itemKarambit;
    public static Block blockSandBag;
    public static Block blockAirRaidSiren;

    public static final Item.ToolMaterial damascusSteelMaterial = EnumHelper.addToolMaterial("damascusSteelMaterial", 4, -1, 20.0F, 90.0F, 20);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        itemKarambit = new itemKarambit(damascusSteelMaterial).setUnlocalizedName("ItemKarambit").setTextureName("wwa:itemkarambit").setCreativeTab(tabWW2Additions);
        blockSandBag = new blockSandbag(Material.cloth).setBlockName("BlockSandBag").setCreativeTab(tabWW2Additions);
        blockAirRaidSiren = new blockAirRaidSiren(Material.iron).setBlockName("BlockAirRaidSiren").setCreativeTab(tabWW2Additions);


        GameRegistry.registerItem(itemKarambit, itemKarambit.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSandBag, blockSandBag.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockAirRaidSiren, blockAirRaidSiren.getUnlocalizedName().substring(5));

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs tabWW2Additions = new CreativeTabs("tabWW2Additions") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(itemKarambit).getItem();

        }
    };

}
