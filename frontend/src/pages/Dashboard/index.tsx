import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import NavBar from "components/NavBar";
import Footer from "components/Footer";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-dark py-3" > DashBoard</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center" >Taxa de sucesso (%)</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center">Todas as Vendas</h5>
                        <DonutChart />
                    </div>
                </div>
                <h1 className="text-dark py-3" > TODAS AS VENDAS</h1>
                <div>
                    <h2 className="text-dark">  </h2>
                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;
