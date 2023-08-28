/*
 * Is JVM machine independent?
 * Explain the use of JVM. How does a
 * JVM make Java machine independent?
 * 
 * 
 * soln: jvm itself is not platform independent, it is different for different
 * os
 * like for mac jvm is coded and built different, similary same goes for
 * windows, linux, chrome os etc.
 * but jvm makes the java application platform independent that means if any
 * machine contains the jvm,
 * the code compiler in any os can run on different os.
 * 
 * so in nutshell JVM itself is not machine independent by if it exists it on
 * any system, then it makes our java application platform independent.
 * 
 * 
 * 
 * Use of JVM:
 * The JVM is a crucial component of the Java platform and serves as an
 * execution environment for Java applications. When you compile a Java source
 * code file, it's converted into bytecode, a platform-independent intermediate
 * representation of the code. This bytecode is then executed by the JVM, which
 * interprets or compiles it into machine-specific instructions for the
 * underlying hardware.
 * 
 * 
 * 
 * How JVM Makes Java Machine Independent:
 * The JVM achieves machine independence through the following mechanisms:
 * 
 * Bytecode: When you compile a Java program, it's converted into bytecode,
 * which is a low-level
 * representation of the program. This bytecode is platform-independent and can
 * be executed on
 * any system with a compatible JVM.
 * 
 * Just-In-Time Compilation (JIT): JVMs often use JIT compilation, which
 * converts bytecode into native
 * machine code at runtime. This process adapts the program's execution to the
 * specific hardware and can
 * lead to improved performance. However, this compilation step is performed by
 * the JVM, allowing the
 * same bytecode to be executed on different platforms.
 * 
 * Memory Management and Garbage Collection: The JVM manages memory and garbage
 * collection, which helps in maintaining a consistent execution environment
 * across platforms. Developers do not need to manage memory manually, reducing
 * the risk of platform-specific memory-related issues.
 * 
 */