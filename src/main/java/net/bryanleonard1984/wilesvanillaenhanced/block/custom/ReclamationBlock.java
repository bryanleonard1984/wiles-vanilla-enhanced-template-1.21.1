package net.bryanleonard1984.wilesvanillaenhanced.block.custom;

import net.bryanleonard1984.wilesvanillaenhanced.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ReclamationBlock extends CustomBlock
{
    public ReclamationBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
    {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 3.0f, 1.0f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity)
    {
        if(entity instanceof ItemEntity itemEntity)
        {
            ItemStack stack = itemEntity.getStack();
            if(isValidItem(stack, ModTags.Items.RECLAMABLE_ITEMS))
            {
                int count = stack.getCount();
                switch (stack.getTranslationKey())
                {
                    case "item.minecraft.rotten_flesh":
                        transformItem(itemEntity, Items.LEATHER, count);
                        break;
                    case "item.minecraft.fermented_spider_eye":
                        transformItem(itemEntity, Items.SPIDER_EYE, count);
                        break;
                    case "item.minecraft.string":
                        transformItem(itemEntity, Items.COBWEB, count);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options)
    {
        tooltip.add(Text.translatable("tooltip.wilesvanillaenhanced.reclamation_block.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
