package ru.job4j.array;

import java.util.Objects;

//39. Кинотеатр

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length - 1; j++) {
                if (places[i][j] == places[i][j + 1] && places[i][j] == null && places[i + 1][j + 1] != null) {
                    return new Place(i, j);
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
