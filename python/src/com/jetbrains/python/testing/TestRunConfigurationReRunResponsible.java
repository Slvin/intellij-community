package com.jetbrains.python.testing;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/**
 * Configuration that handles rerun failed tests itself.
 *
 * @author Ilya.Kazakevich
 */
public interface TestRunConfigurationReRunResponsible {
  /**
   * Rerun failed tests
   * @param executor test executor
   * @param environment test environment
   * @param failedTests a pack of psi elements, indicating failed tests (to retrn)
   * @return state to run
   * @throws ExecutionException failed to run
   */
  @NotNull
  RunProfileState rerunTests(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment,
                             @NotNull Collection<PsiElement> failedTests) throws ExecutionException;
}
