
by.dm_bzh.grow.Dragon.main.Dragon - класс для запуска (консольное взаимодействие с пользователем);
by.dm_bzh.grow.Dragon.main.Treaure - bean-класс - описание сущности сокровища.

by.dm_bzh.grow.Dragon.controller.CaveController - контроллер, запускающий на выполнение объект с методом, необходимым для выполнения полученной задачи 
by.dm_bzh.grow.Dragon.controller.ChoseAction - класс-реализатор выбора необходимого объекта-метода по полученной задаче
by.dm_bzh.grow.Dragon.controller.AddAction/CollectAction/GetExpensiveAction/ShowAction - классы с методами запускающими выполнение выбранного действия

by.dm_bzh.grow.Dragon.in_out.ToShow - класс формирования текста для последующего вывода 
by.dm_bzh.grow.Dragon.in_out.Input - вспомогательный класс для ввода с консоли

by.dm_bzh.grow.Dragon.service.Treasures - класс с методами непосредственного выполнения выбранной задачи
by.dm_bzh.grow.Dragon.service.CreateTreasure - класс с методом создания вводмого пользователем нового "сокровища"

by.dm_bzh.grow.Dragon.dal.DataProvider   - провайдер, возвращающий объект с методами непосредственно взаимодействующими с записанной на диск информацией
by.dm_bzh.grow.Dragon.dal.FileData -  класс с методами записи/и чтения  информации (информации о сокровищах) записанной на диск

by.dm_bzh.grow.Dragon.interfaces.Command - интерфейс, описывающий методы для запуска выполнения выбранной задачи
by.dm_bzh.grow.Dragon.interfaces.DBaccess - интрефейс, описывающий методы взаимодействия с информацией записанной на диске
