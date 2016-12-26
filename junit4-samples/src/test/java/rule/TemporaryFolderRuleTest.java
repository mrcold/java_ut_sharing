package rule;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TemporaryFolderRuleTest
{
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void countsAssets() throws IOException
    {
        File assets = tempFolder.newFolder("assets");
        createAssets(assets, 3);

        for (File file : assets.listFiles()) {
            System.out.println(file.getAbsolutePath());
        }
    }

    private void createAssets(File assets, int numberOfAssets) throws IOException
    {
        for (int index = 0; index < numberOfAssets; index++) {
            File asset = new File(assets, String.format("asset-%d.mpg", index));
            Assert.assertTrue("Asset couldn't be created.", asset.createNewFile());
        }
    }
}
