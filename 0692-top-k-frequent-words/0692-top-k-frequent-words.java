// class Solution {
//     public List<String> topKFrequent(String[] words, int k) {
//         Map<String, Integer> freqMap = new HashMap<>();
//         for (String word : words) {
//             freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
//         }
//         PriorityQueue<String> pq = new PriorityQueue<>(
//             (a, b) -> {
//                 if (freqMap.get(a).equals(freqMap.get(b))) {
//                     return b.compareTo(a); // reverse lexicographical
//                 }
//                 return freqMap.get(a) - freqMap.get(b);
//             }
//         );

//         for (String word : freqMap.keySet()) {
//             pq.offer(word);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         List<String> result = new ArrayList<>();
//         while (!pq.isEmpty()) {
//             result.add(pq.poll());
//         }
//         Collections.reverse(result);
//         return result;
//     }
// }

import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });

        return list.subList(0, k);
    }
}