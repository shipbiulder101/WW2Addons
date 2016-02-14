package com.joshuabasley.WW2Additions.item;


import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.UsernameCache;

import java.util.UUID;

/**
 * Created by josh_000 on 06/02/2016.
 */
public class itemKarambit extends ItemSword {
    public itemKarambit(ToolMaterial material) {
        super(material);
    }


    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5){
        super.onUpdate(stack,world,entity,par4,par5);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();

            if(!player.getUniqueID().toString().equals("09dc5bd8-f874-42af-b231-1c749c3c17f4")){
                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
            }else{

            }



            if(equipped == stack){
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),-1,2));
                player.addPotionEffect(new PotionEffect(Potion.jump.getId(),-1,1));
                player.addPotionEffect(new PotionEffect(Potion.resistance.getId(),-1,2));

            }
        }
    }



}


