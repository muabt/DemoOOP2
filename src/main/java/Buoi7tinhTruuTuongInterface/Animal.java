package Buoi7tinhTruuTuongInterface;

    public abstract class Animal {
        private String name;
        private String color;
        private String size;
        public Animal(){ }
        public Animal(String name, String color, String size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getSize() {
            return size;
        }
        public void setSize(String size) {
            this.size = size;
        }
        // Phương thức trừu tượng: chỉ gồm tên, ko có phần thân chi tiết
        public abstract void makeSound();
        public abstract void move();

}
