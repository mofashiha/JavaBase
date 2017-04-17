package com.xinan.Multithred;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuqianThread implements Runnable {
	private Account account;
    private int amount;
    
    public QuqianThread(int amount) {
		this.amount=amount;
		
	}
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.draw(amount, i);
		}
		System.out.println("----取钱的次数结束！----");
	}

	}


