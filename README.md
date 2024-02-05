# Senior-Seminar-Duggal

## 1/16/24
This program will assign people to different seminars based on the time the form was submitted. When a student is chosen, the algorithm would check if the student would be able to fit in the seminar of their first choice. If they fit, that's where they will be assigned to go. If they don't, then the algorithm would check if the student would be able to fit in the seminar of thei second choice and so on. If a student cannot fit in any of their choices, then they will be saved for later to be randomly assigned to a seminar. For the following seminars, the algorithm would disregard previously assigned seminars.

## 1/18/24
I'm changing my idea a bit: anyone who doesn't fit into the seminar will have a higher priority to be placed in their 2nd choice (if possible). I'm also trying to make the SrSeminar_RawData.csv file easier to read *without changing the data*.

## 1/22/24
I created a new class called "Student.java" and it will contain the info of every student. Every student is placed in an ArrayList called "students". Using a case switch, I'll be converting long Strings such as "Adventure Calls: The Benefits and Challenges of Study Abroad" to a simple int like 1.

## 1/26/24
I have successfully found out the most popular sessions from each choice and how many people picked each session (ex: 17 people picked session 15 as their first choice).

## 1/30/24
I heavily cleaned up data (removed useless data such as submission time), created a new method that finds the most popular choice based on a point ranking system.

## 2/1/24
Today I calculated how many people want to participate in the most popular choice, and I began setting up Session.java
