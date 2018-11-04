import java.io.*;

/**
 *
 */
public class Parser {

	private BufferedReader buffReader;
	private String nextCommand;
	private String currentCommand;
	private int lineCounter;

	/**
	 *
	 * @param inputFile
	 * @throws IOException
	 */
	Parser(File inputFile) throws IOException
	{
		try (FileReader reader = new FileReader(inputFile);
			 BufferedReader buffReader = new BufferedReader(reader))
		{
			this.buffReader = buffReader;
			this.nextCommand = buffReader.readLine();
			this.currentCommand = null;
			this.lineCounter = 0;
		}
	}

	/**
	 *
	 * @return
	 */
	private Boolean hasMoreCommands()
	{
		return nextCommand != null;
	}

	/**
	 *
	 * @throws IOException
	 */
	private void advance() throws IOException
	{
		currentCommand = nextCommand;
		nextCommand = buffReader.readLine();
	}

	private CommandType
}
