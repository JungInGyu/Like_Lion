package day13;

import java.util.HashMap;
import java.util.Scanner;

public class PopulationManager {
    HashMap<String, Integer> map = new HashMap<>();

    public PopulationManager() {


    }
    public void addOrUpdateCity(String cityNmae, int population) {
        if (!map.containsKey(cityNmae)){
            map.put(cityNmae,population);
            System.out.println("새로운 도시의 데이터를 추가했습니다.\t도시:" + cityNmae+"인구: "+population);
        }else {
            map.put(cityNmae,population);
            System.out.println(cityNmae+"의 데이터를 수정했습니다. 인구: "+population);
        }
    }

    public void removeCity(String city){
        if(map.containsKey(city)){
            map.remove(city);
        } else {
            System.out.println("도시가 존재하지 않습니다.");
        }
    }

    private void displayPopulation(String city) {
        if(map.containsKey(city)){
            System.out.println(city+"의 인구 수는: "+map.get(city));
        } else {
            System.out.println("도시가 존재하지 않습니다.");
        }
    }

    private void displayAll() {
        for (String key : map.keySet()){
            System.out.println(key+"시의 인구수는: "+map.get(key));
        }
    }



//알맞게 구현해 주세요.

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (1: 추가/수정, 2: 삭제, 3: 조회, 4: 전체 조회, 5: 종료): ");
            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case 1:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case 2:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case 3:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case 4:
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();    }




}
