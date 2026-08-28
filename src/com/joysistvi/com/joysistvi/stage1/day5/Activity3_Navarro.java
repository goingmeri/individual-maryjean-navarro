package com.joysistvi.stage1.day5;

public class Activity3_Navarro {
        public static void main(String[] args) {

            // 2. Logical AND (&&) - Event entry check
            int age = 20;
            boolean hasValidID = true;

            boolean canEnter = (age >= 18) && hasValidID;
            System.out.println("=== Task 2: Event Entry Check ===");
            System.out.println("Age: " + age + ", Has Valid ID: " + hasValidID);
            System.out.println("Allowed to enter: " + canEnter);

            // 3. Logical OR (||) - No classes today check
            boolean isWeekend = false;
            boolean isHoliday = true;

            boolean noClasses = isWeekend || isHoliday;
            System.out.println("\n=== Task 3: No Classes Check ===");
            System.out.println("Is Weekend: " + isWeekend + ", Is Holiday: " + isHoliday);
            System.out.println("No classes today: " + noClasses);

            // 4. Ternary operator - Pass or Fail
            int score = 82;

            String result = (score >= 75) ? "Passed" : "Failed";
            System.out.println("\n=== Task 4: Pass or Fail Check ===");
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);

            // 5. Ternary operator - Larger number
            int num = 15;
            int num2 = 27;

            int larger = (num > num2) ? num : num2;
            System.out.println("\n=== Task 5: Larger Number Check ===");
            System.out.println("num: " + num + ", num2: " + num2);
            System.out.println("Larger number: " + larger);

    }
}
