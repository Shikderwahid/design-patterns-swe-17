package fileparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFileparser {

	@Test
	void test01() {
		String filepath = "G:\\My Programme JAVA\\Workplace\\designpattern\\csvfile.scsv";
		Parser p = new FileParser().getparser(filepath);
		assertEquals(p.getitemcount(), 3);
		assertEquals(p.getdata(1), "Aeroflot,1197672318,76,14,128");
	}

	@Test
	void test02() {
		String filepath = "G:\\My Programme JAVA\\Workplace\\designpattern\\jsonfile.sjson";
		Parser p = new FileParser().getparser(filepath);

		assertEquals(p.getitemcount(), 3);
		assertEquals(p.getdata(1), "Aeroflot,1197672318,76,14,128");
	}

}
