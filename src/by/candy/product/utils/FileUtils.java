package by.candy.product.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.candy.product.builders.Director;
import by.candy.product.builders.SweetsBuilder;
import by.candy.product.builders.SweetsBuildersPool;
import by.candy.product.entity.Sweet;


public class FileUtils {



	public static final String FILE_FULL_PATH = "./res/Sweets.txt";

	public List<Sweet> getSweetsListFromFile() {

		List<Sweet> sweetsList = new ArrayList<>();

		File file = new File(FILE_FULL_PATH);

		try {

			List<String> fileRows = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			Map<String, Integer> sweetSet = parseFileRows(fileRows);
			sweetsList = creatCertainObjects(sweetSet);

		} catch (IOException e) {
			System.out.println(e);
		}

		return sweetsList;

	}

	private Map<String, Integer> parseFileRows(List<String> fileRows) {

		Map<String, Integer> map = new HashMap<>();

		String[] splitedRow;

		for (int i = 1; i < fileRows.size(); i++) {

			splitedRow = fileRows.get(i).trim().split(",");

			if (splitedRow.length == 2) {

				try {
					int count = Integer.parseInt(splitedRow[1]);
					map.put(splitedRow[0], count);
				} catch (NumberFormatException e) {
					System.out.println(e);
				}

			} else {
				if (!("".equals(splitedRow[0]))) {
					System.out.println("Invalid row`s format: " + fileRows.get(i));
				}
			}
		}

		return map;
	}

	private List<Sweet> creatCertainObjects(Map<String, Integer> sweetSet) {

		List<Sweet> sweetsList = new ArrayList<Sweet>();
		SweetsBuildersPool sbp = new SweetsBuildersPool();
		Director director = new Director();


		for (Map.Entry<String, Integer> element : sweetSet.entrySet()) {

			int count = 0;

			for (Class<? extends SweetsBuilder> clazz : sbp) {

				count++;

				if (clazz.getSimpleName().equals(element.getKey())) {
					try {
						director.setBuilder(clazz.newInstance());

						for (int i = 0; i < element.getValue(); i++) {
							sweetsList.add(director.createSweet());
						}

					} catch (InstantiationException | IllegalAccessException e) {
						System.out.println(e.getMessage());
					}
					count--;
				}

			}

			if (count == sbp.getPoolSize()) {
				System.out.println("Such builder doesn`t exist: " + element.getKey());
			}
		}

		return sweetsList;
	}

}
