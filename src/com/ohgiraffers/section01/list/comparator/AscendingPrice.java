package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* Comparator 사용 시 제네릭 선언을 함꼐 해주어야 compare 메소드의 매개변수 타입이 정의 된다.
* Object 타입인 경우 다운캐스팅해서 사용해야 하므로 제네릭 타입을 결정해주고 사용하는 것이 좋다. */
public class AscendingPrice implements Comparator<BookDTO> { //<- 제네릭타입

    /* sort() 메소드에서 내부적으로 compare(컴페어) 메소드를 호출하여 swap(스왑) 여부를 결정한다.
     * Comparator 인터페이스를 상속 받으면 compare 메소드 오버라이딩이 강제화 된다.  */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        /* 비교 대상 두 인스턴스의 가격이 오름차순 정렬 되기 위해서는 앞의 가격이 더 작은 가격이어야 한다,
        * 만약 뒤의 가격이 더 작은 경우에는 두 인스턴스의 순서를 부꾸어야 한다.
        * 그 때 두값을 바꾸라는 신호로 양수를 반환하면 정렬 시 순서를 바꾸는 조건으로 사용 된다.*/

        int result = 0;

        if(o1.getPrice() > o2.getPrice()){
            result = 1;
        } else if (o1.getPrice() < o2.getPrice()){
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

}
