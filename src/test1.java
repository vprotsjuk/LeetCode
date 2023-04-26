package src;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.add(4);
//        queue.offer(2);
//        queue.add(-11);
//
//        queue.offer(-22);
//        queue.offer(-22);
//
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.poll());
////        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println();


//
//        ArrayDeque<Person> people = new ArrayDeque<Person>();
//        people.addFirst(new Person("Tom"));
//        people.addLast(new Person("Nick"));
//        // перебор без извлечения
//        for (Person p : people) {
//
//            System.out.println(p.getName());
//        }
//    }
//}
//
//class Person {
//
//    private String name;
//
//    public Person(String value) {
//
//        name = value;
//    }
//
//    String getName() {
//        return name;
//    }
//
//}
        int[] arr = {2, 4, 6, 4, 5, 3, 1};
        for (int i = 0; i < arr.length; i++){
           int index = Math.abs(arr[i]);
           if (arr[index] < 0){
               System.out.println(Math.abs(arr[i]));
               break;
//               return Math.abs(arr[i]);
           }
           arr[index] = - arr[index];
        }
        System.out.println(-999);
        String s = " Hello world ";
        String ss = s.trim();
        System.out.println(ss);
        System.out.println(3^2);
        System.out.println(2^1);
        System.out.println(2^2);
        System.out.println(2^3);
        System.out.println(4^6);
        System.out.println(6^4);
        System.out.println(6^6);

        int [] encoded = {1, 2, 3};
        int first = 1;

        int[] output = new int[encoded.length+1];
        output[0] = first;
        for(int i = 1; i < encoded.length; i++){
            output [i] = output[i-1] ^ encoded[i-1];
        }
        System.out.println(Arrays.toString(output));


//        return -1;

     }


 }


//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])){
//                System.out.println(arr[i]);
//                break;
//            }
//            map.put(arr[i],0 );
//        }
//        System.out.println("no");
//    }
//}





