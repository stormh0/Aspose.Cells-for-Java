package com.aspose.cells.examples.RowsColumns;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class AutoFitColumnsinaRangeofCells {
	public static void main(String[] args) throws Exception {
		// ExStart:AutoFitColumnsinaRangeofCells
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AutoFitColumnsinaRangeofCells.class) + "RowsColumns/";

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "workbook.xls");

		// Accessing the first worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Auto-fitting the Column of the worksheet
		worksheet.autoFitColumn(4, 4, 6);

		// Saving the modified Excel file in default (that is Excel 2003) format
		workbook.save(dataDir + "AutoFitColumnsinaRangeofCells_out.xls");

		// Print message
		System.out.println("Columns auto fit successfully.");
		// ExEnd:AutoFitColumnsinaRangeofCells
	}
}
