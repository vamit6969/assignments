package assignment_6Oct_Multithreading;
/*
 * Write  a program to simulate interview process using multithreading.

   Use synchronized keyword and Lock,ReentrantLock for properly synchronizing the process.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterviewProcess {
	public static void main(String[] args) {
		InterviewLock interviewLock = new InterviewLock("Technical Interview", "Indore", "Mca-21");
		Lock lock = new ReentrantLock(true);

		synchronized (interviewLock) {

			Thread candidate1 = new Thread(new CandidateLock("Nitesh", interviewLock, lock));
			Thread candidate2 = new Thread(new CandidateLock("Aman", interviewLock, lock));
			Thread candidate3 = new Thread(new CandidateLock("peetal", interviewLock, lock));
			Thread candidate4 = new Thread(new CandidateLock("Amay", interviewLock, lock));
			Thread candidate5 = new Thread(new CandidateLock("Dinesh", interviewLock, lock));
			Thread candidate6 = new Thread(new CandidateLock("Yadav", interviewLock, lock));
			Thread candidate7 = new Thread(new CandidateLock("Neha", interviewLock, lock));
			Thread candidate8 = new Thread(new CandidateLock("Gandhi", interviewLock, lock));
			Thread candidate9 = new Thread(new CandidateLock("Pappu", interviewLock, lock));
			Thread candidate10 = new Thread(new CandidateLock("Suraj", interviewLock, lock));

			candidate1.start();
			candidate2.start();
			candidate3.start();
			candidate4.start();
			candidate5.start();
			candidate6.start();
			candidate7.start();
			candidate8.start();
			candidate9.start();
			candidate10.start();

		}
	}
}