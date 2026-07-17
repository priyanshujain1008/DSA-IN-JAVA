import java.util.*;

class Solution {

    class Pair {
        char character;
        int frequency;

        Pair(char c, int f) {
            this.character = c;
            this.frequency = f;
        }
    }

    public String reorganizeString(String s) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.frequency - a.frequency);

        Map<Character, Integer> help = new HashMap<>();

        // Frequency count
        for (char ch : s.toCharArray()) {
            help.put(ch, help.getOrDefault(ch, 0) + 1);
        }

        // Put all characters into max heap
        for (char ch : help.keySet()) {
            pq.add(new Pair(ch, help.get(ch)));
        }

        StringBuilder answer = new StringBuilder();

        while (pq.size() >= 2) {

            Pair first = pq.poll();
            Pair second = pq.poll();

            answer.append(first.character);
            answer.append(second.character);

            first.frequency--;
            second.frequency--;

            if (first.frequency > 0) {
                pq.add(first);
            }

            if (second.frequency > 0) {
                pq.add(second);
            }
        }

        // If one character is left
        if (!pq.isEmpty()) {

            Pair last = pq.poll();

            if (last.frequency > 1) {
                return "";
            }

            answer.append(last.character);
        }

        return answer.toString();
    }
}