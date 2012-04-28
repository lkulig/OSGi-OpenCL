package gdts.client.cli.util;

import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

public final class OptionsBuilder
{
  private Options options;

  private OptionsBuilder()
  {
    this.options = new Options();
  }

  public static OptionsBuilder options() {
    return new OptionsBuilder();
  }

  public static OptionsBuilder allOptions() {
    return options().withExecute().withHelp().withListInit().withListTasks().withMaster().withPingOption()
      .withUpload();
  }

  public OptionsBuilder withHelp()
  {
    OptionBuilder.withDescription("print this help"); this.options.addOption(OptionBuilder.create("help"));
    return this;
  }

  public OptionsBuilder withMaster()
  {
    OptionBuilder.withArgName("ip:port"); OptionBuilder.hasArg(); OptionBuilder.withDescription("master ip and port"); this.options.addOption(OptionBuilder.create("master"));
    return this;
  }

  public OptionsBuilder withPingOption()
  {
    OptionBuilder.withDescription("ping master"); this.options.addOption(OptionBuilder.create("ping"));
    return this;
  }

  public OptionsBuilder withListTasks()
  {
    OptionBuilder.withDescription("list all tasks available on master"); this.options.addOption(OptionBuilder.create("listtasks"));
    return this;
  }

  public OptionsBuilder withListInit()
  {
    OptionBuilder.withDescription("list all task instances available on master"); this.options.addOption(OptionBuilder.create("listinst"));
    return this;
  }

  public OptionsBuilder withExecute()
  {
    OptionBuilder.withArgName("instanceId"); OptionBuilder.hasArg(); OptionBuilder.withDescription("executes given instance"); this.options.addOption(OptionBuilder.create("execute"));
    return this;
  }

  public OptionsBuilder withUpload()
  {
    OptionBuilder.withArgName("file"); OptionBuilder.hasArg();
    OptionBuilder.withDescription("uploads task or instance file to master repository");

    this.options.addOption(
      OptionBuilder.create("upload"));
    return this;
  }

  public Options build() {
    return this.options;
  }
}