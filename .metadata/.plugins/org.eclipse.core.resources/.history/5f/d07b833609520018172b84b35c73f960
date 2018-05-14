package edu.mum.asd.designpattern.templatemethod;

import java.util.ArrayList;

public class AlphabetDesignImpl extends AlphabetDesign {
	
	public AlphabetDesignImpl(){}

	@Override
	public ArrayList<String> FullImage(String type,ArrayList<String> array) {
		ArrayList<String> newArray = new ArrayList<String>();
		for (int i = 4; i < array.size() + 1; i++) {
			newArray.add(array.get(i));
		}

		ArrayList<String> completeImg = null;
		switch (type) {

		case "VERTICAL":
			for (int i = 0; i < newArray.size(); i++) {
				completeImg.add(newArray.get(i) + newArray.get(i));

			}

		}

		switch (type) {

		case "NONE":

			for (int i = 0; i < newArray.size(); i++) {
				completeImg.add(newArray.get(i));

			}
			completeImg.add("__________");

			switch (type) {

			case "HORIZONTAL":

				for (int i = 0; i < newArray.size(); i++) {
					completeImg.add(newArray.get(i));

				}
				for (int i = newArray.size(); i > 0; i++) {
					completeImg.add(newArray.get(i));

				}

			}
		}
		return completeImg;
	}

	@Override
	public void drowFullImage(ArrayList<String> str) {
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}

	}

}
