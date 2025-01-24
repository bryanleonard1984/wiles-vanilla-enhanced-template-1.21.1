package net.bryanleonard1984.wilesvanillaenhanced.block.custom;

import net.bryanleonard1984.wilesvanillaenhanced.WilesVanillaEnhanced;
import net.bryanleonard1984.wilesvanillaenhanced.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class DecomposingBlock extends CustomBlock
{
    public DecomposingBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof ItemEntity itemEntity)
        {
            ItemStack stack = itemEntity.getStack();
            if(isValidItem(stack, ModTags.Items.DECAYABLE_ITEMS))
            {
                int count = stack.getCount();
                switch(stack.getTranslationKey())
                {
                    case "block.minecraft.cobweb":
                        transformItem(itemEntity, Items.STRING, count);
                        break;
                    case "item.minecraft.leather":
                        transformItem(itemEntity, Items.ROTTEN_FLESH, count);
                        break;
                    case "item.minecraft.spider_eye":
                        transformItem(itemEntity, Items.FERMENTED_SPIDER_EYE, count);
                        break;
                    default:
                        WilesVanillaEnhanced.LOGGER.info(stack.getTranslationKey());
                        break;
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options)
    {
        tooltip.add(Text.translatable("tooltip.wilesvanillaenhanced.decomposition_block.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
