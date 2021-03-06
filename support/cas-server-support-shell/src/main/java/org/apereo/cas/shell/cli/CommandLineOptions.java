package org.apereo.cas.shell.cli;

import org.apache.commons.cli.Option;

/**
 * This is {@link CommandLineOptions}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public class CommandLineOptions {
    /**
     * Command line option that indicates a shell should be launched.
     */
    public static final Option OPTION_SHELL = Option.builder("sh")
            .longOpt("shell")
            .desc("Launch into a CAS interactive shell to execute commands. Activating this option will disable "
                    + "basic CLI capabilities and allows you to interactively query the CAS configuration metadata server.")
            .build();

    /**
     * Command line option that indicates a property.
     */
    public static final Option OPTION_PROPERTY = Option.builder("p")
            .longOpt("property")
            .hasArg()
            .desc("Indicate the property name (i.e. cas.server.name). A regular expression pattern is an acceptable value, depending on function and usage.")
            .build();

    /**
     * Command line option that indicates a group.
     */
    public static final Option OPTION_GROUP = Option.builder("g")
            .hasArg()
            .longOpt("group")
            .desc("Indicate the group name (i.e. cas.authn). A regular expression pattern is an acceptable value, depending on function and usage.")
            .build();

    /**
     * Command line option that indicates a summary.
     */
    public static final Option OPTION_SUMMARY = Option.builder("su")
            .longOpt("summary")
            .desc("Display a compact version of the query results; Summarize output.")
            .build();

    /**
     * Command line option that indicates a strict-mode matching.
     */
    public static final Option OPTION_STRICT_MATCH = Option.builder("sm")
            .longOpt("strict-match")
            .desc("Control whether pattern matching should be done in strict mode which means "
                    + "the matching engine tries to match the entire region for the query.")
            .build();

    /**
     * Command line option that indicates banner should be skipped.
     */
    public static final Option OPTION_GENERATE_KEY = Option.builder("gk")
            .desc("Generate signing/encryption keys for the specified CAS property group (i.e. cas.webflow). The group must have a child category of 'crypto'.")
            .longOpt("generate-key")
            .build();

    /**
     * Command line option that indicates banner should be skipped.
     */
    public static final Option OPTION_SKIP_BANNER = Option.builder("skb")
            .desc("Skip printing the CAS banner.")
            .longOpt("skip-banner")
            .build();

    /**
     * Command line option that indicates help information should be displayed.
     */
    public static final Option OPTION_HELP = Option.builder("h")
            .desc("Print help and usage information.")
            .longOpt("help")
            .build();

    protected CommandLineOptions() {
    }
}
