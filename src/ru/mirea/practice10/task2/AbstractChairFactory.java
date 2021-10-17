package ru.mirea.practice10.task2;

import ru.mirea.practice10.task2.chair.FunctionalChair;
import ru.mirea.practice10.task2.chair.MagicChair;
import ru.mirea.practice10.task2.chair.VictorianChair;


public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
