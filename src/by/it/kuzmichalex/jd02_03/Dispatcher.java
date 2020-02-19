package by.it.kuzmichalex.jd02_03;

import java.util.concurrent.atomic.AtomicInteger;

class Dispatcher {
    static final int MAX_CASHIERS = 5;            //Больше 5 не надо. сломается логгер. Или нет. Я не проверял )))
    static final int PLAN = 100;
    static final int MIN_BUYERS = 10;             //Яма getBuyersNeed покупателей при плавном изменениии по времени
    static final int MAX_BUYERS = 40;             //Пик getBuyersNeed покупателей при плавном изменении по времени
    static final int MAX_BUYERS_IN_QUEUE = 30;            //Максимальный размер очереди.
    static final int MAX_BUYERS_IN_HALL = 20;               //Максимальное количество на торговом зале
    static final int MAX_BUCKETS = 50;           //Максимальные количество покупателей в магазине

    private final static AtomicInteger buyersCreated = new AtomicInteger(0);
    private final static AtomicInteger buyersInMarket = new AtomicInteger(0);
    private final static AtomicInteger buyersInHall = new AtomicInteger(0);
    private final static AtomicInteger buyersDone = new AtomicInteger(0);
    private final static AtomicInteger marketTotalAmount = new AtomicInteger(0);

    /**
     * Получить количество требуемых покупателей в зависимости от времени.
     * MIN_BUYERS в начале минуты, MAX_BUYERS в середине минуты, примерно вот так:
     * ____/ \       /\
     * __/    \    /   \
     * /       \/       \
     * _______________________t
     *
     * @param nSecond секунда
     * @return требуемое количество покупателей
     */
    static int getBuyersNeed(int nSecond) {
        int nPeriod = nSecond % 60;
        if (nPeriod < 30) return MIN_BUYERS + (MAX_BUYERS - MIN_BUYERS) * nPeriod / 30;    //Восходящий полупериод
        return MAX_BUYERS - (MAX_BUYERS - MIN_BUYERS) * (nPeriod % 30) / 30;               //Нисходящий полупериод
    }

    /*static int getBuyersInside() {
        return buyersInMarket.get();
    }*/

    static int getBuyersDone() {
        return buyersDone.get();
    }

    static int getBuyersCreated() {
        return buyersCreated.get();
    }

    static int incBuyersCreated() {
        return buyersCreated.incrementAndGet();
    }

    static int getBuyersInHall(){
        return buyersInHall.get();
    }

    static int getBuyersInMarket(){
        return buyersInMarket.get();
    }

    static int incBuyersInMarket(){
        return buyersInMarket.incrementAndGet();
    }

    static int decBuyersInMarket(){
        return buyersInMarket.decrementAndGet();
    }


    static int incBuyersInHall(){
        return buyersInHall.incrementAndGet();
    }

    static int decBuyersInHall(){
        return buyersInHall.decrementAndGet();
    }

    static int incBuyersDone(){
        return buyersDone.incrementAndGet();
    }

    static boolean isAllBuyersDone() {
        return buyersDone.get() == PLAN;
    }

    static void addMarketAmount(int amount) {
        marketTotalAmount.getAndAdd(amount);
    }

    static double getMarketTotalAmount() {
        return marketTotalAmount.get();
    }

}
