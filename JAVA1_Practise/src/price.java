public class price{
    public enum Houses {
        KACHHA(10),
        PAKKA(50),
        FLAT(100),
        BUNGLOW(500),
        PENTHOUSE(1000);

        private final int price;

        Houses(int price) {
            this.price = price;
        }

        int getPrice() {
            return price;

        }


        public static void main(String[] args) {
            for(Houses hh :Houses.values()){
                System.out.println(hh + " has a price of "+hh.getPrice()+" Lakhs");
            }
        }
    }
}
