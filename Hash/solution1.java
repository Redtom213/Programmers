package Hash;

import java.util.HashMap;

class solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hMap = new HashMap<>();

        // 참가자를 hMap에 담기
        for (String i : participant) {
            hMap.put(i, hMap.getOrDefault(i, 0) + 1);
        }

        System.out.println(hMap);

        // 완주자를 hMap에서 빼기
        for (String i : completion) {
            hMap.put(i, hMap.get(i) - 1);
        }

        System.out.println(hMap);

        for (String key : hMap.keySet()) {
            if (hMap.get(key) == 1) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] part = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] comp = { "josipa", "filipa", "marina", "nikola" };
        solution1 sol = new solution1();
        System.out.println(sol.solution(part, comp));
    }
}