CREATE TABLE Accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) NOT NULL,
    address TEXT,
    account_type ENUM('Saving', 'Current') NOT NULL,
    balance DECIMAL(10, 2) DEFAULT 0.00 NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    account_id INT NOT NULL,
    transaction_type ENUM('Withdraw', 'Deposit', 'Transfer') NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    description TEXT,
    FOREIGN KEY (account_id) REFERENCES Accounts(account_id)
);


CREATE TABLE FundTransfers (
    transfer_id INT AUTO_INCREMENT PRIMARY KEY,
    sender_account_id INT NOT NULL,
    receiver_account_id INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    description TEXT,
    FOREIGN KEY (sender_account_id) REFERENCES Accounts(account_id),
    FOREIGN KEY (receiver_account_id) REFERENCES Accounts(account_id)
);


CREATE TABLE DeletedAccounts (
    deleted_account_id INT AUTO_INCREMENT PRIMARY KEY,
    account_id INT UNIQUE NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    deleted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


ALTER TABLE Accounts
DROP COLUMN account_type;


ALTER TABLE Accounts
ADD COLUMN CNIC CHAR(13) NOT NULL,
ADD COLUMN PIN CHAR(4) NOT NULL;


set SQL_SAFE_UPDATES = 0;

ALTER TABLE accounts
AUTO_INCREMENT = 4000;

alter table transactions 
drop description;




