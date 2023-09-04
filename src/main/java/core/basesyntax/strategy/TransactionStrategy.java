package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.operation.OperationHandler;

public interface TransactionStrategy {
    OperationHandler getOperation(FruitTransaction.Operation operation);
}
