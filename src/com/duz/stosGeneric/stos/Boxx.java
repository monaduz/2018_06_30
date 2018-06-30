package com.duz.stosGeneric.stos;

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
            return "Box1{" +
                    "element=" + element +
                    '}';
        }


}
