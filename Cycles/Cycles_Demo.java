package May;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cycles {
	
	// сложим два числа
	int sum_v0(int a, int b) {
		
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}

	// тоже самое, только без лишних переменных
	int sum_v0a(int a, int b) {
		
		return a + b;
	}

	// цикл for, специально разбит на отдельные строчки
	int sum_v1(int [] numbers) {
		
		int sum = 0;			// в начале, пока мы не начали считать сумму - она равна нулю
		
		for 
		(
			int i = 0;		/* 1. Начальные условия цикла, задаем переменные до начала выполнения цикла */
			i < numbers.length;	/* 2. Условие выхода из цикла / условие конца цикла, цикл будет выполняться пока это условие верно */
			i = i + 1		/* 3. итерация - это выражение срабатывает каждый шаг цикла */
		) 
		{
			sum = sum + numbers[i];
		}
		
		return sum;
	}

	// Самый короткий
	int sum_v2(int [] digits) {
		
		int sum=0;
		
		for (int number : digits) {
			sum += number;
		}
		
		sum=0;
		
		// Или тоже самое в одну строчку
		
		for (int number : digits) sum += number;
		
		return sum;
	}

	int sum_v3(int [] digits) {
		
		int sum = 0;
		int i = 0;			// Наш счетчик шагов цикла
		int len = digits.length;	// Сколько чисел в массиве
		
		for (;;) {
			
			// Если текущий шаг больше или равен кол-ву чисел в массиве - выходим из цикла
			if ( i >= len)
				break;
			
			sum += digits[i];
			
			i++;	// Считаем шаги цикла
		}
		
		return sum;	// возвращаем результат
	}

	// тоже самое, что и sum_v3, но с небольшим отличием ;)
	int sum_v3a(int [] digits) {
		
		int sum = 0;
		int i = 0;			// Наш счетчик шагов цикла
		int len = digits.length;	// Сколько чисел в массиве
		
		for ( ; ; i++) {
			
			// Если текущий шаг больше или равен кол-ву чисел в массиве - выходим из цикла
			if ( i >= len)
				break;
			
			sum += digits[i];
		}
		
		return sum;
	}

	// тоже самое, что и sum_v3a, но с еще небольшим отличием ;)
	int sum_v3b(int [] digits) {
		
		int sum = 0;
		int i = 0;					// Наш счетчик шагов цикла
		int len = digits.length;	// Сколько чисел в массиве
		
		// Гоняем цикл пока условие (i < len) верно
		for ( /* пусто */ ; i < len; i++) {
			
			sum += digits[i];
		}
		
		return sum;
	}

	// тоже самое, что и sum_v3b, но с еще одним небольшим отличием ;)
	int sum_v3с(int [] digits) {
		
		int sum = 0;
		int len = digits.length;	// Сколько чисел в массиве
		
		for ( int i = 0; i < len; i++) {
			
			sum += digits[i];
		}
		
		return sum;
	}

	// тоже самое, что и sum_v3c, но с еще большим отличием ;)
	int sum_v3d(int [] digits) {
		
		int sum = 0;
		
		for ( int i = 0; i < digits.length; i++) {
			
			sum += digits[i];
		}
		
		return sum;
	}

	// тоже самое, что и sum_v3d, но с еще большим отличием ;)
	int sum_v3e(int [] digits) {
		
		for ( int i = 0, sum = 0; /* тут пусто */ ; i++) {
			if ( i < digits.length ) {
				sum += digits[i];
			}
			else
			{
				return sum;
			}
			
		} // конец for
	} // конец sum_v3e

	// тоже самое, что и sum_v3e, но с небольшим отличием ;)
	int sum_v3f(int [] digits) {
		
		int i = 0, sum = 0;
		
		for (;;) {
			
			if ( i < digits.length )
				sum += digits[i++];
			else
				return sum;
		}
	}

	// Обратный цикл - от кол-ва элементов в массиве до нуля
	int sum_v4(int [] digits) {
		
		int sum = 0;
		int i = digits.length - 1;	// На единицу меньше, т.к. длинна массива - кол-во элементов, а индекс элементов массива начинается с нуля!
				
		for ( /* Тут пусто */ ; i>=0; i--) {
			sum += digits[i];
		}
		
		return sum;
	}

	// А давайте все запихнем в цикл! :Р
	int sum_v5(int [] digits) {
		
		int sum = 0;
		
		for 
		( 
			int i = digits.length;	/* кол-во шагов цикла = кол-ву элементов массива */
			i-->0;			/* шагаем пока наш счетчик шагов положительный и отнимаем единицу на каждом шаге */
			sum += digits[i]	/* а в части цикла отвечающей за шаг - мы считаем сумму :) */
		) 
		{
			/* а в теле цикла пусто :Р */
		}
		
		sum = 0;
		
		// или одной строчкой!
		
		for ( int i = digits.length; i-->0; sum += digits[i] );

		
		sum = 0;
		
		// а можно и так - через запятую в третей части цикла ;)
		
		for ( int i = digits.length; i > 0; i--, sum += digits[i] );
		
		return sum;
	}
	
	// давайте теперь сделаем все тоже самое, только с помощью цикла while
	int sum_v6(int [] numbers) {
		
		int sum = 0;
		int i = 0;
		
		// while(true) - это for (;;)
		while(true) {
			
			if ( i >= numbers.length )
				break;
			
			sum += numbers[i];
			
			i = i + 1;
		}
		
		return sum;
	}

	// а вот так чуть интересней:
	int sum_v6a(int [] numbers) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			
			if ( i == numbers.length )
				return sum;
			
			sum += numbers[i];
			
			i = i + 1;
		}
	}

	// продолжаем "сжимать" наш цикл
	int sum_v7(int [] numbers) {
		
		int sum = 0;
		int i = 0;
		
		while( i < numbers.length ) {
			
			sum += numbers[i];
			
			i = i + 1;
		}
		
		return sum;
	}

	// а тут мы сократили количество шагов в цикле на единицу
	int sum_v7a(int [] numbers) {
		
		int sum = numbers[0];
		int i = 1;
		
		while( i < numbers.length ) {
			
			sum += numbers[i];

			i = i + 1;
		}
		
		return sum;
	}

	// и еще "уже" + обратный цикл
	int sum_v7b(int [] numbers) {
		
		int sum = 0;
		int i = numbers.length;
		
		while( i-->0 ) {
			
			sum += numbers[i];
		}
		
		return sum;
	}

	// Совсем "узко" и небольшой трюк, зато в одну строчку
	// Заметьте, что у цикла нет тела
	int sum_v7c(int [] numbers) {
		
		int sum = 0;
		int i = numbers.length;
		
		while( --i>(sum += numbers[i])*0 );
		
		return sum;
	}

	// Ну и цикл do .. while
	int sum_v8(int [] numbers) {

		int sum = 0;
		int i = numbers.length-1;

		do
			sum += numbers[i];
		while( i-->0 );

		return sum;
	}

	// на десерт )
	// а этот метод называется рекурсией, рекурсия - когда функция вызывает сама себя 
	int sum_v9( int i, int sum, int ... digits ) {

		// когда счетчик шагов закончится - возвращаем сумму
		if (i-- <= 0) 
			return sum;

		// вызываем сами себя до тех пор пока не исчерпаем кол-во шагов
		return sum_v9( i, sum + digits[i], digits);
	}

	// тоже самое что и sum_v9 только в одну строчку
	int sum_v9a( int i, int sum, int ... digits ) {
		return (i-- <= 0) ? sum : sum_v9( i, sum + digits[i], digits );
	}
	
	// И в финале - брутальный вариант
	// используем входной массив для хранения суммы
	int sum_v10( int ... n ) {

		for ( n[0] += n[1], n[1] = n.length; n[1]-->2; n[0] += n[n[1]] );
		
		return n[0];
	}
}

public class Cycles_Demo {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Cycles obj = new Cycles();		// создаем объект Cycles. Это наш "представитель", через которого мы будем "общаться" с классом Cycles
		int [] apples = { 3, 7, 1, 9, 5 };	// Пять партий яблок с разным кол-вом, т.е. массив чисел с именем apples
		int sum;

		sum = obj.sum_v0( 3 , 5 );
		System.out.println("Sum sum_v0\t= " + sum);

		// Давайте считать, сколько у нас яблок

//		sum = obj.sum_v1( apples );
//		System.out.println("Sum v1 = " + sum);

		// тут мы будем вызывать по очереди все методы в нашем классе
		Class tClass = obj.getClass();
		Method[] methods = tClass.getDeclaredMethods();
		
		for (int i = 0; i < methods.length; i++) {
			
//			if ( methods[i].getModifiers() == 2 ) continue;
			if ( methods[i].getParameterCount() != 1 ) continue;
			if ( methods[i].getName().equals("sum_v10") ) continue;

			System.out.format("Sum %s\t= ", methods[i].getName());
			
			sum = (int) methods[i].invoke((Object)obj, apples);
			
			System.out.println(sum);
		}

		sum = obj.sum_v9(apples.length, 0, apples);
		System.out.format("Sum %s\t= %d\n", "sum_v9", sum);

		sum = obj.sum_v9a(apples.length, 0, apples);
		System.out.format("Sum %s\t= %d\n", "sum_v9a", sum);

		// Этот вариант изменяет наш массив - поэтому передаем ему копию		
		sum = obj.sum_v10(apples.clone());
		System.out.format("Sum %s\t= %d\n", "sum_v10", sum);

	}

}
