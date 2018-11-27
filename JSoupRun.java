import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

public class JSoupRun {

	public static void genTextFile(String filePath, String wk) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter(filePath));

		// Grab Quarterback Information
		for (int i = 0; i <= 100; i += 50) {

			String url0 = "http://games.espn.com/ffl/leaders?&slotCategoryId=0&scoringPeriodId=" + wk
					+ "&seasonId=2018&startIndex=" + i;

			// read in the url as a document
			Document qb = Jsoup.connect(url0).timeout(6000).get();

			for (Element row : qb.select("table.playerTableTable.tableBody tr")) {

				if (row.select("td:nth-of-type(1)").text().equals("")
						|| row.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {

					continue;

				} // end if

				else {

					int bye = 0;

					String name = row.select("td:nth-of-type(1)").text();

					String opp = row.select("td:nth-of-type(3)").text();

					String status = row.select("td:nth-of-type(4)").text();

					if (status.equals("")) {
						bye = 1;
						status = "--";
					}

					String ca = row.select("td:nth-of-type(" + (6 - bye) + ")").text();

					String pYds = row.select("td:nth-of-type(" + (7 - bye) + ")").text();

					String pTd = row.select("td:nth-of-type(" + (8 - bye) + ")").text();

					String ints = row.select("td:nth-of-type(" + (9 - bye) + ")").text();

					String rush = row.select("td:nth-of-type(" + (11 - bye) + ")").text();

					String rushYds = row.select("td:nth-of-type(" + (12 - bye) + ")").text();

					String rushTd = row.select("td:nth-of-type(" + (13 - bye) + ")").text();

					String rec = row.select("td:nth-of-type(" + (15 - bye) + ")").text();

					String recYds = row.select("td:nth-of-type(" + (16 - bye) + ")").text();

					String recTd = row.select("td:nth-of-type(" + (17 - bye) + ")").text();

					String recTar = row.select("td:nth-of-type(" + (18 - bye) + ")").text();

					String twoPc = row.select("td:nth-of-type(" + (20 - bye) + ")").text();

					String fuml = row.select("td:nth-of-type(" + (21 - bye) + ")").text();

					String miscTd = row.select("td:nth-of-type(" + (22 - bye) + ")").text();

					String pts = row.select("td:nth-of-type(" + (24 - bye) + ")").text();

					pw.println(name + "," + opp + "," + status + "," + ca + "," + pYds + "," + pTd + "," + ints + ","
							+ rush + "," + rushYds + "," + rushTd + "," + rec + "," + recYds + "," + recTd + ","
							+ recTar + "," + twoPc + "," + fuml + "," + miscTd + "," + pts);

				} // end else
			} // end for each

		} // end for i

		pw.println();

		for (int i = 0; i <= 250; i += 50) {

			StringBuilder sb = new StringBuilder();

			String url2 = "http://games.espn.com/ffl/leaders?&slotCategoryId=2&scoringPeriodId=" + wk
					+ "&seasonId=2018&startIndex=" + i;

			// read in the url as a document
			Document rb = Jsoup.connect(url2).timeout(6000).get();

			for (Element row2 : rb.select("table.playerTableTable.tableBody tr")) {

				if (row2.select("td:nth-of-type(1)").text().equals("")
						|| row2.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {
					continue;

				} // end if
				else {

					int bye = 0;

					String name = row2.select("td:nth-of-type(1)").text();

					String opp = row2.select("td:nth-of-type(3)").text();

					String status = row2.select("td:nth-of-type(4)").text();

					if (opp.equals("** BYE **")) {
						bye = 1;
						status = "--";
					}

					String ca = row2.select("td:nth-of-type(" + (6 - bye) + ")").text();

					String pYds = row2.select("td:nth-of-type(" + (7 - bye) + ")").text();

					String pTd = row2.select("td:nth-of-type(" + (8 - bye) + ")").text();

					String ints = row2.select("td:nth-of-type(" + (9 - bye) + ")").text();

					String rush = row2.select("td:nth-of-type(" + (11 - bye) + ")").text();

					String rushYds = row2.select("td:nth-of-type(" + (12 - bye) + ")").text();

					String rushTd = row2.select("td:nth-of-type(" + (13 - bye) + ")").text();

					String rec = row2.select("td:nth-of-type(" + (15 - bye) + ")").text();

					String recYds = row2.select("td:nth-of-type(" + (16 - bye) + ")").text();

					String recTd = row2.select("td:nth-of-type(" + (17 - bye) + ")").text();

					String recTar = row2.select("td:nth-of-type(" + (18 - bye) + ")").text();

					String twoPc = row2.select("td:nth-of-type(" + (20 - bye) + ")").text();

					String fuml = row2.select("td:nth-of-type(" + (21 - bye) + ")").text();

					String miscTd = row2.select("td:nth-of-type(" + (22 - bye) + ")").text();

					String pts = row2.select("td:nth-of-type(" + (24 - bye) + ")").text();

					pw.println(name + "," + opp + "," + status + "," + ca + "," + pYds + "," + pTd + "," + ints + ","
							+ rush + "," + rushYds + "," + rushTd + "," + rec + "," + recYds + "," + recTd + ","
							+ recTar + "," + twoPc + "," + fuml + "," + miscTd + "," + pts);

				} // end else
			} // end for each

		} // end for i

		pw.println();

		for (int i = 0; i <= 350; i += 50) {

			String url4 = "http://games.espn.com/ffl/leaders?&slotCategoryId=4&scoringPeriodId=" + wk
					+ "&seasonId=2018&startIndex=" + i;

			// read in the url as a document
			Document wr = Jsoup.connect(url4).timeout(6000).get();

			for (Element row4 : wr.select("table.playerTableTable.tableBody tr")) {

				if (row4.select("td:nth-of-type(1)").text().equals("")
						|| row4.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {
					continue;

				} // end if
				else {

					int bye = 0;

					String name = row4.select("td:nth-of-type(1)").text();

					String opp = row4.select("td:nth-of-type(3)").text();

					String status = row4.select("td:nth-of-type(4)").text();

					if (opp.equals("** BYE **")) {
						bye = 1;
						status = "--";
					}

					String ca = row4.select("td:nth-of-type(" + (6 - bye) + ")").text();

					String pYds = row4.select("td:nth-of-type(" + (7 - bye) + ")").text();

					String pTd = row4.select("td:nth-of-type(" + (8 - bye) + ")").text();

					String ints = row4.select("td:nth-of-type(" + (9 - bye) + ")").text();

					String rush = row4.select("td:nth-of-type(" + (11 - bye) + ")").text();

					String rushYds = row4.select("td:nth-of-type(" + (12 - bye) + ")").text();

					String rushTd = row4.select("td:nth-of-type(" + (13 - bye) + ")").text();

					String rec = row4.select("td:nth-of-type(" + (15 - bye) + ")").text();

					String recYds = row4.select("td:nth-of-type(" + (16 - bye) + ")").text();

					String recTd = row4.select("td:nth-of-type(" + (17 - bye) + ")").text();

					String recTar = row4.select("td:nth-of-type(" + (18 - bye) + ")").text();

					String twoPc = row4.select("td:nth-of-type(" + (20 - bye) + ")").text();

					String fuml = row4.select("td:nth-of-type(" + (21 - bye) + ")").text();

					String miscTd = row4.select("td:nth-of-type(" + (22 - bye) + ")").text();

					String pts = row4.select("td:nth-of-type(" + (24 - bye) + ")").text();

					pw.println(name + "," + opp + "," + status + "," + ca + "," + pYds + "," + pTd + "," + ints + ","
							+ rush + "," + rushYds + "," + rushTd + "," + rec + "," + recYds + "," + recTd + ","
							+ recTar + "," + twoPc + "," + fuml + "," + miscTd + "," + pts);

				} // end else
			} // end for
		}

		pw.println();

		for (int i = 0; i <= 150; i += 50) {

			String url6 = "http://games.espn.com/ffl/leaders?&slotCategoryId=6&scoringPeriodId=" + wk
					+ "&seasonId=2018&startIndex=" + i;

			// read in the url as a document
			Document te = Jsoup.connect(url6).timeout(6000).get();

			for (Element row6 : te.select("table.playerTableTable.tableBody tr")) {

				if (row6.select("td:nth-of-type(1)").text().equals("")
						|| row6.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {

					continue;

				} // end if
				else {

					int bye = 0;

					String name = row6.select("td:nth-of-type(1)").text();

					String opp = row6.select("td:nth-of-type(3)").text();

					String status = row6.select("td:nth-of-type(4)").text();

					if (opp.equals("** BYE **")) {
						bye = 1;
						status = "--";
					}

					String ca = row6.select("td:nth-of-type(" + (6 - bye) + ")").text();

					String pYds = row6.select("td:nth-of-type(" + (7 - bye) + ")").text();

					String pTd = row6.select("td:nth-of-type(" + (8 - bye) + ")").text();

					String ints = row6.select("td:nth-of-type(" + (9 - bye) + ")").text();

					String rush = row6.select("td:nth-of-type(" + (11 - bye) + ")").text();

					String rushYds = row6.select("td:nth-of-type(" + (12 - bye) + ")").text();

					String rushTd = row6.select("td:nth-of-type(" + (13 - bye) + ")").text();

					String rec = row6.select("td:nth-of-type(" + (15 - bye) + ")").text();

					String recYds = row6.select("td:nth-of-type(" + (16 - bye) + ")").text();

					String recTd = row6.select("td:nth-of-type(" + (17 - bye) + ")").text();

					String recTar = row6.select("td:nth-of-type(" + (18 - bye) + ")").text();

					String twoPc = row6.select("td:nth-of-type(" + (20 - bye) + ")").text();

					String fuml = row6.select("td:nth-of-type(" + (21 - bye) + ")").text();

					String miscTd = row6.select("td:nth-of-type(" + (22 - bye) + ")").text();

					String pts = row6.select("td:nth-of-type(" + (24 - bye) + ")").text();

					pw.println(name + "," + opp + "," + status + "," + ca + "," + pYds + "," + pTd + "," + ints + ","
							+ rush + "," + rushYds + "," + rushTd + "," + rec + "," + recYds + "," + recTd + ","
							+ recTar + "," + twoPc + "," + fuml + "," + miscTd + "," + pts);

				} // end else
			} // end for
		}

		pw.println();

		String url16 = "http://games.espn.com/ffl/leaders?&slotCategoryId=16&scoringPeriodId=" + wk
				+ "&seasonId=2018&startIndex=0";

		// read in the url as a document
		Document dst = Jsoup.connect(url16).timeout(6000).get();

		for (Element row16 : dst.select("table.playerTableTable.tableBody tr")) {

			if (row16.select("td:nth-of-type(1)").text().equals("")
					|| row16.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {

				continue;

			} // end if
			else {

				int bye = 0;

				String name = row16.select("td:nth-of-type(1)").text();

				String opp = row16.select("td:nth-of-type(3)").text();

				String status = row16.select("td:nth-of-type(4)").text();

				if (opp.equals("** BYE **")) {
					bye = 1;
					status = "--";
				}
				
				String td = row16.select("td:nth-of-type(" + (6 - bye) + ")").text();

				String inter = row16.select("td:nth-of-type(" + (7 - bye) + ")").text();

				String fr = row16.select("td:nth-of-type(" + (8 - bye) + ")").text();

				String sck = row16.select("td:nth-of-type(" + (9 - bye) + ")").text();

				String sfty = row16.select("td:nth-of-type(" + (10 - bye) + ")").text();

				String blk = row16.select("td:nth-of-type(" + (11 - bye) + ")").text();

				String pa = row16.select("td:nth-of-type(" + (12 - bye) + ")").text();

				String pts = row16.select("td:nth-of-type(" + (14 - bye) + ")").text();

				pw.println(name + "," + opp + "," + status + "," + td + "," + inter + "," + fr + "," + sck + "," + sfty
						+ "," + blk + "," + pa + "," + pts);

			} // end else
		} // end for

		pw.println();

		for (int i = 0; i <= 50; i += 50) {

			String url17 = "http://games.espn.com/ffl/leaders?&slotCategoryId=17&scoringPeriodId=" + wk
					+ "&seasonId=2018&startIndex=" + i;

			// read in the url as a document
			Document kicker = Jsoup.connect(url17).timeout(6000).get();

			for (Element row17 : kicker.select("table.playerTableTable.tableBody tr")) {

				if (row17.select("td:nth-of-type(1)").text().equals("")
						|| row17.select("td:nth-of-type(1)").text().equals("PLAYER, TEAM POS")) {

					continue;

				} // end if
				else {

					int bye = 0;

					String name = row17.select("td:nth-of-type(1)").text();

					String opp = row17.select("td:nth-of-type(3)").text();

					String status = row17.select("td:nth-of-type(4)").text();

					if (opp.equals("** BYE **")) {
						bye = 1;
						status = "--";
					}

					String thirtynine = row17.select("td:nth-of-type(" + (6 - bye) + ")").text();

					String fortynine = row17.select("td:nth-of-type(" + (7 - bye) + ")").text();

					String fifty = row17.select("td:nth-of-type(" + (8 - bye) + ")").text();

					String tot = row17.select("td:nth-of-type(" + (9 - bye) + ")").text();

					String xp = row17.select("td:nth-of-type(" + (10 - bye) + ")").text();

					String pts = row17.select("td:nth-of-type(" + (12 - bye) + ")").text();

					pw.println(name + "," + opp + "," + status + "," + thirtynine + "," + fortynine + "," + fifty + ","
							+ tot + "," + xp + "," + pts);

				} // end else
			} // end for
		}

		pw.close();

	}// end main

}
