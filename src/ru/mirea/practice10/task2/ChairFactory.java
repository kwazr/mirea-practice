package ru.mirea.practice10.task2;

import ru.mirea.practice10.task2.chair.FunctionalChair;
import ru.mirea.practice10.task2.chair.MagicChair;
import ru.mirea.practice10.task2.chair.VictorianChair;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
