package com.duz.kolejka;

    public class Boxx<T> {
        private T element;

        public Boxx(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        @Override
        public String toString() {
            return "Boxx{" +
                    "element=" + element +
                    '}';
        }


}
