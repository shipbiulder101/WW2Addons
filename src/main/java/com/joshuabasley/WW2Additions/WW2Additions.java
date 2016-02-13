package com.joshuabasley.WW2Additions;

import com.joshuabasley.WW2Additions.block.blockSandbag;
import com.joshuabasley.WW2Additions.item.itemKarambit;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by josh_000 on 06/02/2016.
 */
@Mod(modid = "wwa", name = "WW2 Additions", version = "1.0")
public class WW2Additions {

     public static Item itemKarambit;
     public static Block blockSandBag;

    public static final Item.ToolMaterial damascusSteelMaterial = EnumHelper.addToolMaterial("damascusSteelMaterial",4,-1,20.0F,90.0F,20);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        itemKarambit = new itemKarambit(damascusSteelMaterial).setUnlocalizedName("ItemKarambit").setTextureName("wwa:itemkarambit");
        blockSandBag = new blockSandbag(Material.anvil).setBlockName("BlockSandBag");


        GameRegistry.registerItem(itemKarambit, itemKarambit.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
