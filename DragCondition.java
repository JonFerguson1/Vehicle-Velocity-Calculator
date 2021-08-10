package sample2;

import java.util.Random;

public class DragCondition {
	static Random random = new Random();

	//dry cement new less than 30 mph
	static double DryCementNewLess = 0.8 + (1.2 - 0.8) * random.nextDouble();

	//dry cement new more than 30 mph
	static double DryCementNewMore = 0.7 + (1 - 0.7) * random.nextDouble();

	//wet cement new less than 30 mph
	static double WetCementNewLess = 0.5 + (0.8 - 0.5) * random.nextDouble();

	//wet cement new more than 30 mph
	static double WetCementNewMore = 0.4 + (0.75 - 0.4) * random.nextDouble();

	//dry cement used less than 30 mph
	static double DryCementUsedLess = 0.6 + (0.8 - 0.6) * random.nextDouble();

	//dry cement used more than 30 mph
	static double DryCementUsedMore = 0.6 + (0.75 - 0.6) * random.nextDouble();

	//wet cement used less than 30 mph
	static double WetCementUsedLess = 0.45 + (0.7 - 0.45) * random.nextDouble();

	//wet cement used more than 30 mph
	static double WetCementUsedMore = 0.45 + (0.65 - 0.45) * random.nextDouble();

	//dry cement revised less than 30 mph
	static double DryCementRevisedLess = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//dry cement revised more than 30 mph
	static double DryCementRevisedMore = 0.5 + (0.65 - 0.5) * random.nextDouble();

	//wet cement revised less than 30 mph
	static double WetCementRevisedLess = 0.45 + (0.65 - 0.45) * random.nextDouble();

	//wet cement revised more than 30 mph
	static double WetCementRevisedMore = 0.45 + (0.6 - 0.45) * random.nextDouble();

	//dry asphalt new less than 30 mph
	static double DryAsphaltNewLess = 0.8 + (1.2 - 0.8) * random.nextDouble();

	//dry asphalt new more than 30 mph
	static double DryAsphaltNewMore = 0.65 + (1 - 0.65) * random.nextDouble();

	//wet asphalt new less than 30 mph
	static double WetAsphaltNewLess = 0.5 + (0.8 - 0.5) * random.nextDouble();

	//wet asphalt new more than 30 mph
	static double WetAsphaltNewMore = 0.45 + (0.75 - 0.45) * random.nextDouble();

	//dry asphalt used less than 30 mph
	static double DryAsphaltUsedLess = 0.6 + (0.8 - 0.6) * random.nextDouble();

	//dry asphalt used more than 30 mph
	static double DryAsphaltUsedMore = 0.55 + (0.7 - 0.55) * random.nextDouble();

	//wet asphalt used less than 30 mph
	static double WetAsphaltUsedLess = 0.45 + (0.7 - 0.45) * random.nextDouble();

	//wet asphalt used more than 30 mph
	static double WetAsphaltUsedMore = 0.4 + (0.65 - 0.4) * random.nextDouble();

	//dry asphalt revised less than 30 mph
	static double DryAsphaltRevisedLess = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//dry asphalt revised more than 30 mph
	static double DryAsphaltRevisedMore = 0.45 + (0.65 - 0.45) * random.nextDouble();

	//wet asphalt revised less than 30 mph
	static double WetAsphaltRevisedLess = 0.45 + (0.65 - 0.45) * random.nextDouble();

	//wet asphalt revised more than 30 mph
	static double WetAsphaltRevisedMore = 0.4 + (0.6 - 0.4) * random.nextDouble();

	//dry asphalt tarred less than 30 mph
	static double DryAsphaltTarredLess = 0.5 + (0.6 - 0.5) * random.nextDouble();

	//dry asphalt tarred more than 30 mph
	static double DryAsphaltTarredMore = 0.35 + (0.6 - 0.35) * random.nextDouble();

	//wet asphalt tarred less than 30 mph
	static double WetAsphaltTarredLess = 0.3 + (0.6 - 0.3) * random.nextDouble();

	//wet asphalt tarred more than 30 mph
	static double WetAsphaltTarredMore = 0.25 + (0.55 - 0.25) * random.nextDouble();

	//dry gravel packed less than 30 mph
	static double DryGravelPackedLess = 0.55 + (0.85 - 0.55) * random.nextDouble();

	//dry gravel packed more than 30 mph
	static double DryGravelPackedMore = 0.5 + (0.8 - 0.5) * random.nextDouble();

	//wet gravel packed less than 30 mph
	static double WetGravelPackedLess = 0.4 + (0.8 - 0.4) * random.nextDouble();

	//wet gravel packed more than 30 mph
	static double WetGravelPackedMore = 0.4 + (0.6 - 0.4) * random.nextDouble();

	//dry gravel loose less than 30 mph
	static double DryGravelLooseLess = 0.4 + (0.7 - 0.4) * random.nextDouble();

	//dry gravel loose more than 30 mph
	static double DryGravelLooseMore = 0.4 + (0.7 - 0.4) * random.nextDouble();

	//wet gravel loose less than 30 mph
	static double WetGravelLooseLess = 0.45 + (0.75 - 0.45) * random.nextDouble();

	//wet gravel loose more than 30 mph
	static double WetGravelLooseMore = 0.45 + (0.75 - 0.45) * random.nextDouble();

	//dry cinders less than 30 mph
	static double DryCindersLess = 0.5 + (0.7 - 0.5) * random.nextDouble();

	//dry cinders more than 30 mph
	static double DryCindersMore = 0.5 + (0.7 - 0.5) * random.nextDouble();

	//wet cinders less than 30 mph
	static double WetCindersLess = 0.65 + (0.75 - 0.65) * random.nextDouble();

	//wet cinders more than 30 mph
	static double WetCindersMore = 0.65 + (0.75 - 0.65) * random.nextDouble();

	//dry rock less than 30 mph
	static double DryRockLess = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//dry rock more than 30 mph
	static double DryRockMore = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//wet rock less than 30 mph
	static double WetRockLess = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//wet rock more than 30 mph
	static double WetRockMore = 0.55 + (0.75 - 0.55) * random.nextDouble();

	//dry ice less than 30 mph
	static double DryIceLess = 0.1 + (0.25 - 0.1) * random.nextDouble();

	//dry ice more than 30 mph
	static double DryIceMore = 0.07 + (0.2 - 0.07) * random.nextDouble();

	//wet ice less than 30 mph
	static double WetIceLess = 0.05 + (0.1 - 0.05) * random.nextDouble();

	//wet ice more than 30 mph
	static double WetIceMore = 0.05 + (0.1 - 0.05) * random.nextDouble();

	//dry snow packed less than 30 mph   
	static double DrySnowPackedLess = 0.3 + (0.55 - 0.3) * random.nextDouble();

	//dry snow packed more than 30 mph
	static double DrySnowPackedMore = 0.35 + (0.55 - 0.35) * random.nextDouble();

	//wet snow packed less than 30 mph
	static double WetSnowPackedLess = 0.3 + (0.6 - 0.3) * random.nextDouble();

	//wet snow packed more than 30 mph
	static double WetSnowPackedMore = 0.3 + (0.6 - 0.3) * random.nextDouble();

	//dry snow loose less than 30 mph
	static double DrySnowLooseLess = 0.1 + (0.25 - 0.1) * random.nextDouble();

	//dry snow loose more than 30 mph
	static double DrySnowLooseMore = 0.1 + (0.2 - 0.1) * random.nextDouble();

	//wet snow loose less than 30 mph
	static double WetSnowLooseLess = 0.3 + (0.6 - 0.3) * random.nextDouble();

	//wet snow loose more than 30 mph
	static double WetSnowLooseMore = 0.3 + (0.6 - 0.3) * random.nextDouble();
}
