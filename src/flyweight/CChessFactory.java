package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CChessFactory {
	Map<String,IChess> chessMap=new HashMap<String,IChess>();
	
	public IChess getChess(String color)
	{
			if(chessMap.containsKey(color))
			{
				return chessMap.get(color);
			}
			else
			{
				IChess chess=new CChess(color);
				chessMap.put(color, chess);
				return chess;
			}
	}
}

