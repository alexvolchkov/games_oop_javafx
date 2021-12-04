package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlackCopy = bishopBlack.copy(Cell.B2);
        assertThat(bishopBlackCopy.position(), is(Cell.B2));
    }

    @Test
    public void whenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5));
    }

    @Test
    public void whenIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5));
    }

    @Test
    public void whenWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] excepted = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(excepted));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        bishopBlack.way(Cell.G5);
    }
}