/**
 * 
 */
package com.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author tushar
 *
 */
public class StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<SamplePoJo> pojos = new ArrayList<>();
		pojos.add(new SamplePoJo(400, "test3", "test3@gmail.com"));
		pojos.add(new SamplePoJo(500, "test4", "test4@gmail.com"));
		pojos.add(new SamplePoJo(200, "test1", "test1@gmail.com"));
		pojos.add(new SamplePoJo(300, "test2", "test2@gmail.com"));
		
		System.out.println("Before Sort");
		for (SamplePoJo pojo : pojos) {
			System.out.println(pojo);
		}
		
		System.out.println("After Sort");

		pojos.sort(Comparator.comparing(SamplePoJo::getId));
		pojos.sort((SamplePoJo s1, SamplePoJo s2)->s1.getId()-s2.getId());

		pojos.forEach(System.out::println);
		
		// filter with existing list
		
		System.out.println("After Filter");
		
		List<SamplePoJo> newPojos = pojos.stream().filter(p-> p.getId() > 200).collect(Collectors.toList());
		
		newPojos.forEach(System.out::println);
		
		System.out.println("List to Map");
		
		Map<Integer, String> listToMap = newPojos.stream().collect(Collectors.toMap(SamplePoJo::getId, SamplePoJo::getName));

        System.out.println("List to Map : " + listToMap);
        
		System.out.println("Map to List");
		
		List<String> stringPojos = listToMap.values().stream().collect(Collectors.toList());

        System.out.println("map to List : ");
        stringPojos.forEach(System.out::println);
		
		int count = (int) pojos.stream().filter(p-> p.getId() > 200).count();
		
		System.out.println("After Filter Count : " + count);
		
		List<String> names = pojos.stream().filter(p-> p.getId() > 200).map(SamplePoJo::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		String name = pojos.stream().filter(p-> p.getId() == 200).map(SamplePoJo::getName).findAny().orElse("");
		
		System.out.println("name : " + name);
		
		SamplePoJo pojo = pojos.stream().filter(p-> p.getId() == 200).findAny().orElse(null);
		
		System.out.println("pojo : " + pojo);
		
		name = pojos.stream().filter(p-> p.getId() > 200).map(SamplePoJo::getName).collect(Collectors.joining(","));
		
		System.out.println("comma sepatred name : " + name);
		
		System.out.println("Map with new List");
		
		//Map with new list
		List<Integer> ids = pojos.stream().map(StreamExample::getIntegerList).collect(Collectors.toList());
		
		ids.forEach(System.out::println);
		
		System.out.println("Map with new List with filter");
		
		ids = pojos.stream().map(StreamExample::getIntegerList).filter(p->p.intValue() > 200).collect(Collectors.toList());
		
		ids.forEach(System.out::println);
		
		Integer id = pojos.stream().map(StreamExample::getIntegerList).filter(p->p.intValue() == 200).findAny().orElse(null);
		
		System.out.println("id : " + id);
		
		Set<Object> mergedSet = Stream.concat(pojos.stream(), ids.stream()).collect(Collectors.toSet());
		
		mergedSet.forEach(System.out::println);

	}
	
	public static Integer getIntegerList(SamplePoJo pojo) {
		
		return pojo.getId();
	}

}
