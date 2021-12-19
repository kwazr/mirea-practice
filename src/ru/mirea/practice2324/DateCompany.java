package ru.mirea.practice2324;

import java.util.HashMap;
import java.util.Map;

public class DateCompany {
    private double expenses = 0;
    private double income = 0;
    private Map<String, Double> expensesAllComp = new HashMap<String, Double>();

    public void newDateCompany(String str) {

        String[] stroka = str.split(",", 8);
        double dohod = Double.parseDouble(stroka[6].replaceAll("\"", "").replace(',', '.'));
        double rashod = Double.parseDouble(stroka[7].replaceAll("\"", "").replace(',', '.'));
        this.expenses += rashod;
        this.income += dohod;

        String[] s = stroka[5].trim().split(" {3,}")[1].split("/");
        String[] strokaCompany = s[s.length - 1].split("\\\\");
        String company = strokaCompany[strokaCompany.length - 1];

        if (!expensesAllComp.containsKey(company)) {
            expensesAllComp.put(company, rashod);

        } else {
            double sum = expensesAllComp.get(company);
            sum += rashod;
            expensesAllComp.put(company, sum);
        }

    }

    public void outResult() {
        System.out.println("Сумма доходов:" + this.income + " rub");
        System.out.println("Сумма расходов " + this.expenses + " rub");
        System.out.println("Расходы по компаниям: ");

        for (String company : this.expensesAllComp.keySet()) {

            System.out.println(company + ": " + this.expensesAllComp.get(company) + "руб");

        }


    }
}
