package zerokun265.fabric.copperrings.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class JewelerStationBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;


    public JewelerStationBlock(Settings settings) {
        super(settings);
    }
    public static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(13, 0, 0, 16, 2, 3),
            Block.createCuboidShape(14, 0, 13, 17, 2, 16),
            Block.createCuboidShape(0, 0, 13, 3, 2, 16),
            Block.createCuboidShape(0, 0, 0, 3, 2, 3),
            Block.createCuboidShape(2, 2, 2, 3, 3, 14),
            Block.createCuboidShape(13, 2, 2, 14, 3, 14),
            Block.createCuboidShape(3, 2, 2, 13, 3, 3),
            Block.createCuboidShape(3, 2, 13, 13, 3, 14),
            Block.createCuboidShape(2, 3, 2, 14, 9, 14),
            Block.createCuboidShape(10.975, 11.285, 6.25, 11.375, 11.585, 8.25),
            Block.createCuboidShape(11.825, 11.01, 7.25, 12.825, 12.01, 11.25),
            Block.createCuboidShape(12, 8, 10.75, 13, 12, 11.75),
            Block.createCuboidShape(4.75, 12.51, 7.3, 8.75, 12.81, 10.225),
            Block.createCuboidShape(4.5, 12.01, 7.25, 5.5, 12.99, 10.25),
            Block.createCuboidShape(8.5, 12.01, 7.25, 9.5, 12.99, 10.25),
            Block.createCuboidShape(5, 12, 6.75, 9, 13, 7.75),
            Block.createCuboidShape(5, 12, 9.75, 9, 13, 10.75),
            Block.createCuboidShape(3, 12.01, 10.5, 7, 13.01, 11.5),
            Block.createCuboidShape(3, 8, 11.75, 4, 13, 12.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(13, 0, 13, 16, 2, 16),
            Block.createCuboidShape(0, 0, 13, 3, 2, 16),
            Block.createCuboidShape(0, 0, 0, 3, 2, 3),
            Block.createCuboidShape(13, 0, 0, 16, 2, 3),
            Block.createCuboidShape(2, 2, 2, 14, 3, 3),
            Block.createCuboidShape(2, 2, 13, 14, 3, 14),
            Block.createCuboidShape(13, 2, 3, 14, 3, 13),
            Block.createCuboidShape(2, 2, 3, 3, 3, 13),
            Block.createCuboidShape(2, 3, 2, 14, 9, 14),
            Block.createCuboidShape(6.737739888546692, 11.285, 10.713975234612928, 8.737739888546692, 11.585, 11.113975234612928),
            Block.createCuboidShape(3.487955110048622, 11.010000000000002, 10.519728116088183, 7.487955110048622, 12.010000000000002, 11.519728116088183),
            Block.createCuboidShape(4.25, 8, 12, 5.25, 12, 13),
            Block.createCuboidShape(5.775, 12.51, 4.75, 8.7, 12.81, 8.75),
            Block.createCuboidShape(5.75, 12.01, 4.5, 8.75, 12.99, 5.5),
            Block.createCuboidShape(5.75, 12.01, 8.5, 8.75, 12.99, 9.5),
            Block.createCuboidShape(8.25, 12, 5, 9.25, 13, 9),
            Block.createCuboidShape(5.25, 12, 5, 6.25, 13, 9),
            Block.createCuboidShape(6.029693181999598, 12.010000000000002, 2.309713055297772, 7.029693181999598, 13.010000000000002, 6.309713055297772),
            Block.createCuboidShape(3.25, 8, 3, 4.25, 13, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 13, 3, 2, 16),
            Block.createCuboidShape(0, 0, 0, 3, 2, 3),
            Block.createCuboidShape(13, 0, 0, 16, 2, 3),
            Block.createCuboidShape(13, 0, 13, 16, 2, 16),
            Block.createCuboidShape(13, 2, 2, 14, 3, 14),
            Block.createCuboidShape(2, 2, 2, 3, 3, 14),
            Block.createCuboidShape(3, 2, 13, 13, 3, 14),
            Block.createCuboidShape(3, 2, 2, 13, 3, 3),
            Block.createCuboidShape(2, 3, 2, 14, 9, 14),
            Block.createCuboidShape(4.886024765387072, 11.285, 6.737739888546692, 5.286024765387072, 11.585, 8.737739888546692),
            Block.createCuboidShape(4.480271883911817, 11.010000000000002, 3.487955110048622, 5.480271883911817, 12.010000000000002, 7.487955110048622),
            Block.createCuboidShape(3, 8, 4.25, 4, 12, 5.25),
            Block.createCuboidShape(7.25, 12.51, 5.775, 11.25, 12.81, 8.7),
            Block.createCuboidShape(10.5, 12.01, 5.75, 11.5, 12.99, 8.75),
            Block.createCuboidShape(6.5, 12.01, 5.75, 7.5, 12.99, 8.75),
            Block.createCuboidShape(7, 12, 8.25, 11, 13, 9.25),
            Block.createCuboidShape(7, 12, 5.25, 11, 13, 6.25),
            Block.createCuboidShape(9.690286944702228, 12.010000000000002, 6.029693181999598, 13.690286944702228, 13.010000000000002, 7.029693181999598),
            Block.createCuboidShape(12, 8, 3.25, 13, 13, 4.25)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 0, 0, 3, 2, 3),
            Block.createCuboidShape(13, 0, 0, 16, 2, 3),
            Block.createCuboidShape(13, 0, 13, 16, 2, 16),
            Block.createCuboidShape(0, 0, 13, 3, 2, 16),
            Block.createCuboidShape(2, 2, 13, 14, 3, 14),
            Block.createCuboidShape(2, 2, 2, 14, 3, 3),
            Block.createCuboidShape(2, 2, 3, 3, 3, 13),
            Block.createCuboidShape(13, 2, 3, 14, 3, 13),
            Block.createCuboidShape(2, 3, 2, 14, 9, 14),
            Block.createCuboidShape(7.262260111453308, 11.285, 4.886024765387072, 9.262260111453308, 11.585, 5.286024765387072),
            Block.createCuboidShape(8.512044889951378, 11.010000000000002, 4.480271883911817, 12.512044889951378, 12.010000000000002, 5.480271883911817),
            Block.createCuboidShape(10.75, 8, 3, 11.75, 12, 4),
            Block.createCuboidShape(7.300000000000001, 12.51, 7.25, 10.225, 12.81, 11.25),
            Block.createCuboidShape(7.25, 12.01, 10.5, 10.25, 12.99, 11.5),
            Block.createCuboidShape(7.25, 12.01, 6.5, 10.25, 12.99, 7.5),
            Block.createCuboidShape(6.75, 12, 7, 7.75, 13, 11),
            Block.createCuboidShape(9.75, 12, 7, 10.75, 13, 11),
            Block.createCuboidShape(8.970306818000402, 12.010000000000002, 9.690286944702228, 9.970306818000402, 13.010000000000002, 13.690286944702228),
            Block.createCuboidShape(11.75, 8, 12, 12.75, 13, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST -> SHAPE_E;
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            default -> SHAPE_N;
        };
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}
